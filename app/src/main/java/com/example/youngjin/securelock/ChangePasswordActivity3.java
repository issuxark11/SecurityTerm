package com.example.youngjin.securelock;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.widget.Toast;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;


public class ChangePasswordActivity3 extends Activity implements OnClickListener{


    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, my_insert, reset;
    int count =0; //비밀번호 수
    String current_pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepassword3);

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
        my_insert = (Button) findViewById(R.id.my_insert);
        reset = (Button) findViewById(R.id.reset);

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
    protected void onPause() {
        super.onPause();
        this.finish();
    }
    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.button0) {
            String content = new String("0");
            count++;
            if (count == 1) {
                current_pw = content;
            }//비밀번호 하나 받았을 때
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
        else if(v.getId()==R.id.button1) {
            String content = new String("1");
            count++;
            if (count == 1) {
                current_pw = content;
            }//비밀번호 하나 받았을 때
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
            }//비밀번호 하나 받았을 때
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
            }//비밀번호 하나 받았을 때
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
            }//비밀번호 하나 받았을 때
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
            }//비밀번호 하나 받았을 때
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
            }//비밀번호 하나 받았을 때
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
            }//비밀번호 하나 받았을 때
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
            }//비밀번호 하나 받았을 때
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
            }//비밀번호 하나 받았을 때
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
            if(count==4) {//4자리이면

                try {//2에서 입력한 값 출력
                    FileInputStream fis = openFileInput("test1.txt");
                    byte[] data = new byte[fis.available()];

                    while (fis.read(data) != -1) {
                        ;
                    }
                    fis.close();
                    String text = current_pw;           //지금까지 쌓인 패스워드

                    byte[] key = "ISterm_WAE*".getBytes();
                    key = Arrays.copyOf(key, 16);
                    Key secureKey = new SecretKeySpec(key,"AES"); // 암호화 키 생성
                    Cipher cipher = Cipher.getInstance("AES"); // AES로 초기화
                    cipher.init(Cipher.DECRYPT_MODE, secureKey); // decrypt mode 세팅


                    String data_s = new String(cipher.doFinal(data)); //byte를 복호화하여 string에 넣는다.



                    if(text.compareTo(data_s)==0) {
                  /*  Toast toast = Toast.makeText(this, "일치", Toast.LENGTH_SHORT);//일치 띄우는 대신에 여기서 액티비티를 finish 시키면 돼요.
                    toast.show();*/
                        try {
                            Toast toast = Toast.makeText(this, "비밀번호가 설정되었습니다.", Toast.LENGTH_SHORT);
                            toast.show();
                            //data(암호화 되었던 data)를 write
                            FileOutputStream fos = openFileOutput("test1.txt", Context.MODE_WORLD_READABLE);
                            fos.write(data);
                            fos.close();

                            this.finish();
                            current_pw = "";
                            count = 0;
                        }
                        catch (Exception e) {
                            Toast toast = Toast.makeText(this, "exception : " + e, Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                    else{
                        Toast toast = Toast.makeText(this, "다시 시도", Toast.LENGTH_SHORT);
                        toast.show();
                        current_pw="";
                        count=0;
                        Intent intent = new Intent().setClass(ChangePasswordActivity3.this, ChangePasswordActivity2.class);
                        startActivity(intent);
                    }
                } catch (Exception e){ ;}


            }
            else {
                Toast toast = Toast.makeText(this, "4자리가 아닙니다.", Toast.LENGTH_SHORT);
                toast.show();
                current_pw="";
                count=0;

            }
        }

    }
}
