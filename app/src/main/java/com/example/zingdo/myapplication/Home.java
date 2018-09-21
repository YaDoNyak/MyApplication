package com.example.zingdo.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.LongBuffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Home extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    TextView today;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        today = findViewById(R.id.date);
        bottomNavigationView = findViewById(R.id.navigation);
        TextView text = (TextView) findViewById(R.id.date);
        CalendarView calendar = (CalendarView) findViewById(R.id.calender);
        String date = new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
        today.setText(date);
        calendar.setVisibility(View.INVISIBLE);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return true;
            }
        });


        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            CalendarView calendar = (CalendarView) findViewById(R.id.calender);
            TextView text = (TextView) findViewById(R.id.date);
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                text.setText(year + "년" + (month + 1) + "월" + dayOfMonth + "일");
                calendar.setVisibility(View.INVISIBLE);
            }
        });
    }

    void onClick(View v){
        Intent intent = new Intent(this, MyPage.class);
        startActivity(intent);
    }

    public void onClick_calender(View v) {
        ImageButton btn = findViewById(R.id.btn0);
        final CalendarView calendar = (CalendarView) findViewById(R.id.calender);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (calendar.getVisibility() != View.VISIBLE) {
                    calendar.setVisibility(View.VISIBLE);
                } else {
                    calendar.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
