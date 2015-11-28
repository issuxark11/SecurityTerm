package com.example.youngjin.securelock;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

/**
 * Created by youngjin on 2015-11-28.
 */
public class PasswordActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // For LockScreen Function
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD); // 순정 잠금 화면 없애기
        setContentView(R.layout.activity_pw);
    }
}
