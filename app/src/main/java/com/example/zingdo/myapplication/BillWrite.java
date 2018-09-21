package com.example.zingdo.myapplication;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BillWrite extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_write);
        btn = findViewById(R.id.button2);
    }

    public void onClick(View v) {

        final String[] items = new String[]{"국회운영위원회", "법제사법위원회", "정무위원회", "기획재정위원회", "과학기술정보\n방송통신위원회", "교육문화체육관광위원회",
                                            "외교통일위원회", "국방위원회", "행정안전위원회", "국방위원회", "행정안전위원회", "농림축산해양수산위원회", "산업통상자원\n중소벤처기업위원회",
                                            "보건복지위원회", "정보위원회", "여성가족위원회", "환경노동위원회", "국토교통위원회"};
        final int[] selectedIndex = {0};

        AlertDialog.Builder dialog = new AlertDialog.Builder(BillWrite.this);
        dialog .setTitle("위원회를 선택해 주세요").setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
            @Override public void onClick(DialogInterface dialog, int which) {
                selectedIndex[0] = which;
            }
        }) .setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                items[selectedIndex[0]].replaceAll("\n", " ");
                btn.setTextColor(Color.rgb(0x41, 0xcb, 0x35));
                btn.setText(items[selectedIndex[0]]);
            }
        }).create().show();
    };
}
