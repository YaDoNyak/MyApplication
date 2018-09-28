package com.example.zingdo.myapplication;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MyPage extends AppCompatActivity {

    ImageButton change_name;
    AlertDialog.Builder ad;
    TextView name;
    AlertDialog.Builder builder;
    ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);
        btn_back = findViewById(R.id.back_home);
        change_name = findViewById(R.id.change_name);
        name = findViewById(R.id.name);
        builder = new AlertDialog.Builder(this);

        Button change_password = findViewById(R.id.change_password);
        change_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_login, null);
                Button submit = view.findViewById(R.id.buttonSubmit);
                EditText present_password = view.findViewById(R.id.editText_present_password);
                EditText change_password = view.findViewById(R.id.editText_change_password);
                EditText change_password_again = view.findViewById(R.id.editText_change_password_again);
                AlertDialog dialog = builder.create();
                builder.setView(view);
                dialog.show();
            }
        });
    }

    public void Change_name(View v) {
        ad = new AlertDialog.Builder(MyPage.this);

        ad.setTitle("이름 변경");
        String message = "현재 이름 : " + name.getText();
        ad.setMessage(message);

        final EditText et = new EditText(MyPage.this);
        ad.setView(et);

        ad.setPositiveButton("저장", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String value = et.getText().toString();
                dialog.dismiss();
                name.setText(value);
            }
        });

        ad.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        ad.show();
    }

    public void onClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}