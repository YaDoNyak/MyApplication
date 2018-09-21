package com.example.zingdo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SendEmail extends AppCompatActivity {

    String text;
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);
        Intent intent = getIntent();


        text = "[" + email + "]" + "이메일로 인증링크가 발송되었습니다.\n이메일에서 인증링크를 눌러 비밀번호를 변경해주세요.";
        TextView email_text = findViewById(R.id.textView4);
        email_text.setText(text);
    }
}
