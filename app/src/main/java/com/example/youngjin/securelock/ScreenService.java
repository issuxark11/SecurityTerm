package com.example.youngjin.securelock;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.widget.Toast;

public class ScreenService extends Service {
    private ScreenReceiver sReceiver;

    @Override
    public void onCreate()
    {
        super.onCreate();
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        sReceiver = new ScreenReceiver();
        registerReceiver(sReceiver,filter);
        Toast toast = Toast.makeText(this, "Start LockScreen Service", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        super.onStartCommand(intent, flags, startId);
        if(intent == null)
        {
            IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
            filter.addAction(Intent.ACTION_SCREEN_OFF);
            sReceiver = new ScreenReceiver();
            registerReceiver(sReceiver,filter);
        }
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent){
        return null;
    }

    @Override
    public void onDestroy()
    {
        unregisterReceiver(sReceiver);
        Toast toast = Toast.makeText(this, "Finish LockScreen Service", Toast.LENGTH_SHORT);
        toast.show();
    }
}