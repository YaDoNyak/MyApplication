package com.example.zingdo.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FragmentBill extends Fragment{
    BottomNavigationView bottomNavigationView;
    TextView do_first;
    TextView time_first;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_bill, container, false);
        bottomNavigationView = getActivity().findViewById(R.id.navigation);
        do_first = view.findViewById(R.id.do_first);
        time_first = view.findViewById(R.id.time_first);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return true;
            }
        });

        return view;
    }
}
