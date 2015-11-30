package com.example.youngjin.securelock;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfigActivity extends Activity {

    private Button OnBtn, OffBtn;
    private Button bluetooth_menu, password_set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        OnBtn = (Button) findViewById(R.id.onBtn);
        OffBtn = (Button) findViewById(R.id.offBtn);

        //비밀번호 테스트 화면으로
        bluetooth_menu = (Button) findViewById(R.id.bluetooth_menu);
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
            public void onClick(View v) {
                Intent intent = new Intent().setClass(ConfigActivity.this, SetPasswordActivity.class);
                startActivity(intent);
            }
        });

    }
}