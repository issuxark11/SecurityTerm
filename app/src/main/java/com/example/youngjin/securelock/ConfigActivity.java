package com.example.youngjin.securelock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfigActivity extends Activity {

    private Button OnBtn, OffBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        OnBtn = (Button) findViewById(R.id.onBtn);
        OffBtn = (Button) findViewById(R.id.offBtn);

        OnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfigActivity.this, ScreenReceiver.class);
                startService(intent);
                ConfigActivity.this.finish();
            }
        });

        OffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfigActivity.this, ScreenReceiver.class);
                stopService(intent);
                ConfigActivity.this.finish();
            }
        });
    }
}