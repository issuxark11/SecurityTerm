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
<<<<<<< HEAD
=======

public class ScreenReceiver extends BroadcastReceiver {
>>>>>>> a2cd50528e153cba63bcce83e9200b878a583741

public class ScreenReceiver extends BroadcastReceiver { // BroadcastReceiver Component
    // Detect Screen on/off Action
    public static boolean screenoff;

<<<<<<< HEAD
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
=======
    private BluetoothAdapter mBtAdapter;
    private TelephonyManager telephonyManager = null;
    private boolean isPhoneIdle = true;
    private boolean isBluetoothConnection = false;
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(BluetoothDevice.ACTION_ACL_CONNECTED)) {
            isBluetoothConnection = true;
        }

>>>>>>> a2cd50528e153cba63bcce83e9200b878a583741
        if (intent.getAction().equals(BluetoothDevice.ACTION_ACL_DISCONNECTED)) {
            isBluetoothConnection = false;
        }

        if (intent.getAction().equals(BluetoothDevice.ACTION_ACL_DISCONNECT_REQUESTED)) {
            isBluetoothConnection = false;
        }

<<<<<<< HEAD
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {  // When Screen_Off Action comes in
=======
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
>>>>>>> a2cd50528e153cba63bcce83e9200b878a583741
            screenoff = true;

            if (telephonyManager == null) {
                telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE); // Check phone State
                telephonyManager.listen(phoneListener, PhoneStateListener.LISTEN_CALL_STATE);
            }

            if (isPhoneIdle) {
<<<<<<< HEAD
                mBtAdapter = BluetoothAdapter.getDefaultAdapter(); // create local Bluetooth adapter

                Set<BluetoothDevice> pairedDevices = mBtAdapter.getBondedDevices(); // currently paired device

                // If there are paired devices, add each one to the ArrayAdapter
                if (pairedDevices.size() > 0) {
                    if(isBluetoothConnection == true) {  // Bluetooth Connection on
                        Intent changeIntent = new Intent(context, MainActivity.class);   // Change Intent to MainActivity
                        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, changeIntent, 0);

=======
                // Get the local Bluetooth adapter

                mBtAdapter = BluetoothAdapter.getDefaultAdapter();

                // Get a set of currently paired devices
                Set<BluetoothDevice> pairedDevices = mBtAdapter.getBondedDevices();

                // If there are paired devices, add each one to the ArrayAdapter
                if (pairedDevices.size() > 0) {
                    if(isBluetoothConnection == true) {
                        Intent changeIntent = new Intent(context, MainActivity.class);
                        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, changeIntent, 0);

>>>>>>> a2cd50528e153cba63bcce83e9200b878a583741
                        try {
                            pendingIntent.send();
                        } catch (Exception ex) {

                        }
<<<<<<< HEAD
                    } else {  // Bluetooth Connection off
                        Intent changeIntent = new Intent(context, PasswordActivity.class);  // Change Intent to PasswordActivity
                        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, changeIntent, 0);

                        try {
                            pendingIntent.send();
                        } catch (Exception ex) {

=======
                    } else if (isBluetoothConnection == false) {
                        Intent changeIntent = new Intent(context, PasswordActivity.class);
                        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, changeIntent, 0);

                        try {
                            pendingIntent.send();
                        } catch (Exception ex) {

>>>>>>> a2cd50528e153cba63bcce83e9200b878a583741
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
<<<<<<< HEAD
            } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {  // When Scrreen_ON Action Comes in
=======
            } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
>>>>>>> a2cd50528e153cba63bcce83e9200b878a583741
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
