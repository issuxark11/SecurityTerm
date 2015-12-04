package com.example.youngjin.securelock;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileInputStream;
import java.security.Key;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class ConfigActivity extends Activity {

    private Button OnBtn, OffBtn;
    private Button bluetooth_menu, password_set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        OnBtn = (Button) findViewById(R.id.onBtn);
        OffBtn = (Button) findViewById(R.id.offBtn);

        bluetooth_menu = (Button) findViewById(R.id.bluetooth_set);
        password_set = (Button) findViewById(R.id.password_set);

        OnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfigActivity.this, ScreenService.class);
                startService(intent);
                ConfigActivity.this.finish();
            }
        });

        OffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfigActivity.this, ScreenService.class);
                stopService(intent);
                ConfigActivity.this.finish();
            }
        });

        bluetooth_menu.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try {
                    final Intent intent = new Intent(Intent.ACTION_MAIN, null);
                    intent.addCategory(Intent.CATEGORY_LAUNCHER);
                    final ComponentName cn = new ComponentName("com.android.settings", "com.android.settings.bluetooth.BluetoothSettings");
                    intent.setComponent(cn);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity( intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        password_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {// Check if there is password in the file or not.
                                         
                //File read start
                try {
                    FileInputStream fis = openFileInput("test1.txt");
                    byte[] data = new byte[fis.available()];

                    while (fis.read(data) != -1) {
                        ;
                    }
                    fis.close();


                    String data_s = new String(data);

                    if (data_s == "") {//If there's no password in file(null), let user set password directly.
                        Intent intent = new Intent().setClass(ConfigActivity.this, ChangePasswordActivity2.class);
                        startActivity(intent);

                    } else {//If there's password in file, check if the user know password.
                        Intent intent = new Intent().setClass(ConfigActivity.this, ChangePasswordActivity1.class);
                        startActivity(intent);
                    }
                }
                 catch (Exception e){ ;}

            }
        });

    }
}