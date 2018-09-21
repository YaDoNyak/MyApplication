package com.example.zingdo.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentBill extends Fragment{
    public static FragmentBill newInstance() {
        return new FragmentBill();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main_bill, container, false); // 여기서 UI를 생성해서 View를 return
    }

}
