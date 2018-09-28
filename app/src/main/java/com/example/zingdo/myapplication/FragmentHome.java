package com.example.zingdo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FragmentHome extends Fragment {

    BottomNavigationView bottomNavigationView;
    TextView today;
    CalendarView calendar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_home, container, false);

        ImageButton b1 = view.findViewById(R.id.btn0);
        calendar = view.findViewById(R.id.calender);

        today = view.findViewById(R.id.date);
        bottomNavigationView = getActivity().findViewById(R.id.navigation);
        String date = new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
        today.setText(date);
        calendar.setVisibility(View.INVISIBLE);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return true;
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calendar.getVisibility() != View.VISIBLE) {
                    calendar.setVisibility(View.VISIBLE);
                } else {
                    calendar.setVisibility(View.INVISIBLE);
                }
            }
        });

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            TextView text = view.findViewById(R.id.date);
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                text.setText(year + "년" + (month + 1) + "월" + dayOfMonth + "일");
                calendar.setVisibility(View.INVISIBLE);
            }
        });

        ImageButton btn = view.findViewById(R.id.btn0);
        final CalendarView calendar = view.findViewById(R.id.calender);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (calendar.getVisibility() != View.VISIBLE) {
                    calendar.setVisibility(View.VISIBLE);
                } else {
                    calendar.setVisibility(View.INVISIBLE);
                }
            }
        });

        ImageButton btn_intent = view.findViewById(R.id.btn1);
        btn_intent.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent1 = new Intent(getActivity(), MyPage.class);
                startActivity(intent1);
            }
        });

        return view;
    }
}
