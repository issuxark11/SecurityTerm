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
    int count =0; //비밀번호 수
    String current_pw; //지금 입력하고 있는 비밀번호
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
        my_insert = (Button) findViewById(R.id.my_insert);//제출버튼
        reset = (Button) findViewById(R.id.reset);//다시 쓰기 버튼

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
            else if(count>4) {//네개 이상 입력받으면 초기화됨
                current_pw = "";
                count=0;
            }
            else if(count==4){//네개 다 받았을 때 제출하라고 토스트메세지 뜸
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
            if (count == 1) {//비밀번호 하나 받았을 때
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
        else if(v.getId()==R.id.my_insert){         //s라고 써있는 버튼을 누르면 current_pw에 쌓인 텍스트와 파일출력을 통해 얻은 data를 비교
            try {
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
                //이걸 복호화하시면 돼요. data 자체가 String 타입과 비교하면 깨져서 한번 변환을 거쳤어요.
                //data 를 복호화하셔서 다시 String으로 바꿔야하는지 아니면 String으로 바꾼 data_s를 복호화해야하는지 모르겠어요.ㅠㅠ


                if(text.compareTo(data_s)==0) {
                  /*  Toast toast = Toast.makeText(this, "일치", Toast.LENGTH_SHORT);//일치 띄우는 대신에 여기서 액티비티를 finish 시키면 돼요.
                    toast.show();*/
                    current_pw="";
                    count=0;
                    Intent intent = new Intent().setClass(ChangePasswordActivity1.this, ChangePasswordActivity2.class);
                    startActivity(intent);


                }
                else{
                    Toast toast = Toast.makeText(this, "다시 시도", Toast.LENGTH_SHORT);
                    toast.show();
                    current_pw="";
                    count=0;
                }
            } catch (Exception e){ ;}


        }

    }
}

