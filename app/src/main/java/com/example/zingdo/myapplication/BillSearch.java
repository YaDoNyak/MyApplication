package com.example.zingdo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

public class BillSearch extends AppCompatActivity {

    EditText search_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_search);
    }

        public void onClick(View v) {
            search_text = findViewById(R.id.textView2);
            String text = search_text.getText().toString();
            Intent intent = new Intent(this, SendEmail.class);
            intent.putExtra("text", text);
            startActivity(intent);
        }
}
