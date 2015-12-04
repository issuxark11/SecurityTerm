package com.example.youngjin.securelock;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;

import android.widget.Toast;

import java.io.FileInputStream;
import java.security.Key;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class ChangePasswordActivity1 extends Activity implements OnClickListener{



    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, my_insert, reset;
    int count =0; //Input count
    String current_pw; //Input
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
        setContentView(R.layout.activity_changepassword1);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        my_insert = (Button) findViewById(R.id.my_insert);//Submit button
        reset = (Button) findViewById(R.id.reset);//Reset button

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        my_insert.setOnClickListener(this);
        reset.setOnClickListener(this);



    }
    @Override
    protected void onPause() {//If other activity starts, finish this activity.
        super.onPause();
        this.finish();
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button0) {
            String content = new String("0");
            count++;
            if (count == 1) {//First input
                current_pw = content;
            }
            else if(count>4) {//If the number of input becomes 5, initialize input text and count. 
                current_pw = "";
                count=0;
            }
            else if(count==4){//If the number of input becomes 4, suggest user to submit.
                current_pw = current_pw + content;
                Toast.makeText(this, "제출하세요", Toast.LENGTH_SHORT).show();
            }
            else {
                current_pw = current_pw + content;
            }
        }
        else if(v.getId()==R.id.button1) {
            String content = new String("1");
            count++;
            if (count == 1) {
                current_pw = content;
            }
            else if(count>4) {
                current_pw = "";
                count=0;
            }
            else if(count==4){
                current_pw = current_pw + content;
                Toast.makeText(this, "제출하세요", Toast.LENGTH_SHORT).show();
            }
            else {
                current_pw = current_pw + content;
            }
        }
        else if(v.getId()==R.id.button2) {
            String content = new String("2");
            count++;
            if (count == 1) {
                current_pw = content;
            }
            else if(count>4) {
                current_pw = "";
                count=0;
            }
            else if(count==4){
                current_pw = current_pw + content;
                Toast.makeText(this, "제출하세요", Toast.LENGTH_SHORT).show();
            }
            else {
                current_pw = current_pw + content;
            }
        }
        else if(v.getId()==R.id.button3) {
            String content = new String("3");
            count++;
            if (count == 1) {
                current_pw = content;
            }
            else if(count>4) {
                current_pw = "";
                count=0;
            }
            else if(count==4){
                current_pw = current_pw + content;
                Toast.makeText(this, "제출하세요", Toast.LENGTH_SHORT).show();
            }
            else {
                current_pw = current_pw + content;
            }
        }
        else if(v.getId()==R.id.button4) {
            String content = new String("4");
            count++;
            if (count == 1) {
                current_pw = content;
            }
            else if(count>4) {
                current_pw = "";
                count=0;
            }
            else if(count==4){
                current_pw = current_pw + content;
                Toast.makeText(this, "제출하세요", Toast.LENGTH_SHORT).show();
            }
            else {
                current_pw = current_pw + content;
            }
        }
        else if(v.getId()==R.id.button5) {
            String content = new String("5");
            count++;
            if (count == 1) {
                current_pw = content;
            }
            else if(count>4) {
                current_pw = "";
                count=0;
            }
            else if(count==4){
                current_pw = current_pw + content;
                Toast.makeText(this, "제출하세요", Toast.LENGTH_SHORT).show();
            }
            else {
                current_pw = current_pw + content;
            }
        }
        else if(v.getId()==R.id.button6) {
            String content = new String("6");
            count++;
            if (count == 1) {
                current_pw = content;
            }
            else if(count>4) {
                current_pw = "";
                count=0;
            }
            else if(count==4){
                current_pw = current_pw + content;
                Toast.makeText(this, "제출하세요", Toast.LENGTH_SHORT).show();
            }
            else {
                current_pw = current_pw + content;
            }
        }
        else if(v.getId()==R.id.button7) {
            String content = new String("7");
            count++;
            if (count == 1) {
                current_pw = content;
            }
            else if(count>4) {
                current_pw = "";
                count=0;
            }
            else if(count==4){
                current_pw = current_pw + content;
                Toast.makeText(this, "제출하세요", Toast.LENGTH_SHORT).show();
            }
            else {
                current_pw = current_pw + content;
            }
        }
        else if(v.getId()==R.id.button8) {
            String content = new String("8");
            count++;
            if (count == 1) {
                current_pw = content;
            }
            else if(count>4) {
                current_pw = "";
                count=0;
            }
            else if(count==4){
                current_pw = current_pw + content;
                Toast.makeText(this, "제출하세요", Toast.LENGTH_SHORT).show();
            }
            else {
                current_pw = current_pw + content;
            }
        }
        else if(v.getId()==R.id.button9) {
            String content = new String("9");
            count++;
            if (count == 1) {
                current_pw = content;
            }
            else if(count>4) {
                current_pw = "";
                count=0;
            }
            else if(count==4){
                current_pw = current_pw + content;
                Toast.makeText(this, "제출하세요", Toast.LENGTH_SHORT).show();
            }
            else {
                current_pw = current_pw + content;
            }
        }
        else if(v.getId()==R.id.reset){
            current_pw="";
            count=0;
        }
        else if(v.getId()==R.id.my_insert){//If the user press submit button, compare user's input to data that can be gained by reading 'text1.txt'.
            try {
                //File read start
                FileInputStream fis = openFileInput("test1.txt");
                byte[] data = new byte[fis.available()];

                while (fis.read(data) != -1) {
                    ;
                }
                fis.close();
                String text = current_pw;

                byte[] key = "ISterm_WAE*".getBytes(); // static private key
                key = Arrays.copyOf(key, 16);             // because of AES-128, copy only 16bytes.
                Key secureKey = new SecretKeySpec(key,"AES"); // generates secure key 
                Cipher cipher = Cipher.getInstance("AES"); // get AES instance 
                cipher.init(Cipher.DECRYPT_MODE, secureKey); // decrypt mode setting


                String data_s = new String(cipher.doFinal(data)); // decrypt the byte code and store into String
       


                if(text.compareTo(data_s)==0) {//If user's input==reading data, let user change password.
                    current_pw="";
                    count=0;
                    Intent intent = new Intent().setClass(ChangePasswordActivity1.this, ChangePasswordActivity2.class);
                    startActivity(intent);


                }
                else{//If user's input!=reading data, suggest to try again.
                    Toast toast = Toast.makeText(this, "다시 시도", Toast.LENGTH_SHORT);
                    toast.show();
                    current_pw="";
                    count=0;
                }
            } catch (Exception e){ ;}


        }

    }
}

