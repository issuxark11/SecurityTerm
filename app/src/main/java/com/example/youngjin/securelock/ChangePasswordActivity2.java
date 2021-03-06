package com.example.youngjin.securelock;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.widget.Toast;


import java.io.FileOutputStream;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;


public class ChangePasswordActivity2 extends Activity implements OnClickListener{


    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, my_insert, reset;
    int count =0; //Input count
    String current_pw; //Input
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepassword2);

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
        my_insert = (Button) findViewById(R.id.my_insert); //Submit button
        reset = (Button) findViewById(R.id.reset); //Reset button

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
        else if(v.getId()==R.id.my_insert){
            if(count==4) {
                
                try {
                    //File write start
                    FileOutputS
                    tream fos = openFileOutput("test2.txt", Context.MODE_WORLD_READABLE);
                    String text = current_pw;


                    byte[] key = "ISterm_WAE*".getBytes();           // static private key
                    key = Arrays.copyOf(key, 16);                       // because of AES-128, copy only 16bytes.
                    Key secureKey = new SecretKeySpec(key, "AES"); // generates secure key 

                    Cipher cipher = Cipher.getInstance("AES");  // get AES instance 
                    cipher.init(Cipher.ENCRYPT_MODE, secureKey);// encrypt mode setting
                    byte[] encryptedData = cipher.doFinal(text.getBytes()); // encrypt normal text password to encrypted byte data

                    fos.write(encryptedData);  // write encrypted data into file
                    fos.close();

                    //After writing text into the file, Start next activity.
                    Intent intent = new Intent().setClass(ChangePasswordActivity2.this, ChangePasswordActivity3.class);
                    startActivity(intent);

                } catch (Exception e) {
                    Toast toast = Toast.makeText(this, "exception : " + e, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
            else {//If the number of input!=4, suggest user to set again.
                Toast toast = Toast.makeText(this, "4자리가 아닙니다.", Toast.LENGTH_SHORT);
                toast.show();
                current_pw="";
                count=0;

            }
        }

    }
}
