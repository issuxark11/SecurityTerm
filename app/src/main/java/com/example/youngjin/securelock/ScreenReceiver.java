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

public class ScreenReceiver extends BroadcastReceiver { // BroadcastReceiver Component
    // Detect Screen on/off Action
    public static boolean screenoff;

    // Detect Bluetooth Connection
    private BluetoothAdapter mBtAdapter;

    // Detect PhoneState
    private TelephonyManager telephonyManager = null;
    private boolean isPhoneIdle = true;
    private boolean isBluetoothConnection = false;

    @Override
    public void onReceive(Context context, Intent intent) {

        // Check BluetoothConnection state and set isBluetoothConnection Flag
        if (intent.getAction().equals(BluetoothDevice.ACTION_ACL_CONNECTED)) {
            isBluetoothConnection = true;
        }
        if (intent.getAction().equals(BluetoothDevice.ACTION_ACL_DISCONNECTED)) {
            isBluetoothConnection = false;
        }

        if (intent.getAction().equals(BluetoothDevice.ACTION_ACL_DISCONNECT_REQUESTED)) {
            isBluetoothConnection = false;
        }

        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {  // When Screen_Off Action comes in
            screenoff = true;

            if (telephonyManager == null) {
                telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE); // Check phone State
                telephonyManager.listen(phoneListener, PhoneStateListener.LISTEN_CALL_STATE);
            }

            if (isPhoneIdle) {
                mBtAdapter = BluetoothAdapter.getDefaultAdapter(); // create local Bluetooth adapter

                Set<BluetoothDevice> pairedDevices = mBtAdapter.getBondedDevices(); // currently paired device

                // If there are paired devices, add each one to the ArrayAdapter
                if (pairedDevices.size() > 0) {
                    if(isBluetoothConnection == true) {  // Bluetooth Connection on
                        Intent changeIntent = new Intent(context, MainActivity.class);   // Change Intent to MainActivity
                        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, changeIntent, 0);

                        try {
                            pendingIntent.send();
                        } catch (Exception ex) {

                        }
                    } else {  // Bluetooth Connection off
                        Intent changeIntent = new Intent(context, PasswordActivity.class);  // Change Intent to PasswordActivity
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
            } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {  // When Scrreen_ON Action Comes in
                screenoff = false;
            }
        }
    }

    private PhoneStateListener phoneListener = new PhoneStateListener() {  // Check onCallState
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
