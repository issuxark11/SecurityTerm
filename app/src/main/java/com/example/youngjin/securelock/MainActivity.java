package com.example.youngjin.securelock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

import android.widget.SeekBar;



public class MainActivity extends Activity {
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // LockScreen Start
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD); // 순정 잠금 화면 없애기
        setContentView(R.layout.activity_main);


        //밀어서 잠금해제
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


                                               @Override

                                               public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                               }

                                               @Override
                                               public void onStartTrackingTouch(SeekBar seekBar) {
                                               }

                                               @Override
                                               public void onStopTrackingTouch(SeekBar seekBar) {
                                                   // 80 % 이상 간격에 들어오면 잠금을 해제
                                                   if (seekBar.getProgress() >= 80) {
                                                       finish();
                                                   } else {
                                                       seekBar.setProgress(0);
                                                   }
                                               }
                                           }
        );
        seekBar.setOnTouchListener(new SeekBar.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //손 떼면 progress 초기화
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    seekBar.setProgress(0);
                }
                return false;
            }
        });






    }

}






