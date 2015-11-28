package com.example.youngjin.securelock;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

import java.util.Set;

public class ScreenReceiver extends BroadcastReceiver {

    public static boolean screenoff;

    private BluetoothAdapter mBtAdapter;
    private TelephonyManager telephonyManager = null;
    private boolean isPhoneIdle = true;
    private boolean isBluetoothConnection = false;
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(BluetoothDevice.ACTION_ACL_CONNECTED)) {
            isBluetoothConnection = true;
        }

        if (intent.getAction().equals(BluetoothDevice.ACTION_ACL_DISCONNECTED)) {
            isBluetoothConnection = false;
        }

        if (intent.getAction().equals(BluetoothDevice.ACTION_ACL_DISCONNECT_REQUESTED)) {
            isBluetoothConnection = false;
        }

        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            screenoff = true;

            if (telephonyManager == null) {
                telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
                telephonyManager.listen(phoneListener, PhoneStateListener.LISTEN_CALL_STATE);
            }

            if (isPhoneIdle) {
                // Get the local Bluetooth adapter

                mBtAdapter = BluetoothAdapter.getDefaultAdapter();

                // Get a set of currently paired devices
                Set<BluetoothDevice> pairedDevices = mBtAdapter.getBondedDevices();

                // If there are paired devices, add each one to the ArrayAdapter
                if (pairedDevices.size() > 0) {
                    if(isBluetoothConnection == true) {
                        Intent changeIntent = new Intent(context, MainActivity.class);
                        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, changeIntent, 0);

                        try {
                            pendingIntent.send();
                        } catch (Exception ex) {

                        }
                    } else if (isBluetoothConnection == false) {
                        Intent changeIntent = new Intent(context, PasswordActivity.class);
                        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, changeIntent, 0);

                        try {
                            pendingIntent.send();
                        } catch (Exception ex) {

                        }
                    }
                } else {
                    Intent changeIntent = new Intent(context, PasswordActivity.class);
                    PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, changeIntent, 0);

                    try {
                        pendingIntent.send();
                    } catch (Exception ex) {

                    }
                }
            } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
                screenoff = false;
            }
        }
    }

    private PhoneStateListener phoneListener = new PhoneStateListener() {
        @Override
        public void onCallStateChanged(int state, String incomingNumber)
        {
            switch (state) {
                case TelephonyManager.CALL_STATE_IDLE:
                    isPhoneIdle = true;
                    break;
                case TelephonyManager.CALL_STATE_RINGING:
                    isPhoneIdle = false;
                    break;
                case TelephonyManager.CALL_STATE_OFFHOOK:
                    isPhoneIdle = false;
                    break;
            }
        }
    };
}