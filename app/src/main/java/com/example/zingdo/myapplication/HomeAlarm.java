package com.example.zingdo.myapplication;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class HomeAlarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_alarm);
        ImageView imageView1 = (ImageView) findViewById(R.id.picture1);
        imageView1.setBackground(new ShapeDrawable(new OvalShape()));
        imageView1.setClipToOutline(true);
        ImageView imageView2 = (ImageView) findViewById(R.id.picture2);
        imageView2.setBackground(new ShapeDrawable(new OvalShape()));
        imageView2.setClipToOutline(true);
        ImageView imageView3 = (ImageView) findViewById(R.id.picture3);
        imageView3.setBackground(new ShapeDrawable(new OvalShape()));
        imageView3.setClipToOutline(true);
        ImageView imageView4 = (ImageView) findViewById(R.id.picture4);
        imageView4.setBackground(new ShapeDrawable(new OvalShape()));
        imageView4.setClipToOutline(true);
    }
}
