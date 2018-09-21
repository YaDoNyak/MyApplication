package com.example.zingdo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowPosts extends AppCompatActivity {

    ImageButton btnplus;
    ImageButton btngood;
    ImageButton btnbad;
    int check = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_posts);
        btnplus = findViewById(R.id.button3);
        btngood = findViewById(R.id.button4);
        btnbad = findViewById(R.id.button5);
    }

    public void onClick(View v){
        btnplus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btngood.getVisibility()!=View.VISIBLE){
                    btngood.setVisibility(View.VISIBLE);
                    btnbad.setVisibility(View.VISIBLE);
                    btnplus.setRotation(45);
                }else{
                    btngood.setVisibility(View.INVISIBLE);
                    btnbad.setVisibility(View.INVISIBLE);
                    btnplus.setRotation(0);
                }
            }
        });

    }
}
