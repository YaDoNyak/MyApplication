package com.example.zingdo.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPassword extends AppCompatActivity {
    String text;
    EditText input;
    String email;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_password);
        input = findViewById(R.id.editText);
        email = input.getText().toString();
        button = findViewById(R.id.button);

    }

    public void onClick(View v){
        email = input.getText().toString();
        Intent intent = new Intent(this, SendEmail.class);
        intent.putExtra("text", email);
        startActivity(intent);
    }
}
