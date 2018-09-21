package com.example.zingdo.myapplication;

import android.app.Dialog;
import android.content.DialogInterface;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);
        change_name = findViewById(R.id.change_name);
        name = findViewById(R.id.name);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ad.show();
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

    void show()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_login, null);
        builder.setView(view);
        final Button submit = (Button) view.findViewById(R.id.buttonSubmit);
        final EditText present_password = (EditText) view.findViewById(R.id.editText_present_password);
        final EditText change_password = (EditText) view.findViewById(R.id.editText_change_password);
        final EditText change_password_again = (EditText) view.findViewById(R.id.editText_change_password_again);
        final AlertDialog dialog = builder.create();
        dialog.show();

    }
}