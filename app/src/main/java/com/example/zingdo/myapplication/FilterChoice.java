package com.example.zingdo.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class FilterChoice extends AppCompatActivity implements View.OnClickListener{
    int congress_operation_check=0;//1
    int law_check = 0;//2
    int politic_problem_check = 0;//3
    int management_money_check = 0;//4
    int science_tech_check = 0;//5
    int edu_culture_pe_check = 0;//6
    int unification_check = 0;//7
    int soldier_check = 0;//8
    int administration_safe_Check = 0;//9
    int country_food_check = 0; //10
    int venture_company_check = 0; //11
    int health_welfare_check = 0;//12
    int information_check = 0; //13
    int family_check = 0;
    int environment_check = 0; // 15
    int traffic_check = 0; //16
    Intent intent = new Intent(this, MainBill.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_choice);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.card_view1 :
                if(congress_operation_check == 1){
                    ImageView image = findViewById(R.id.image1);
                    TextView text = findViewById(R.id.text1);
                    image.setImageResource(R.drawable.congress_operation);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    congress_operation_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image1);
                    TextView text = findViewById(R.id.text1);
                    image.setImageResource(R.drawable.congress_operation_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    congress_operation_check = 1;
                    break;
                }

            case R.id.card_view2 :
                if(law_check == 1){
                    ImageView image = findViewById(R.id.image2);
                    TextView text = findViewById(R.id.text2);
                    image.setImageResource(R.drawable.law);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    law_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image2);
                    TextView text = findViewById(R.id.text2);
                    image.setImageResource(R.drawable.law_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    law_check = 1;
                    break;
                }

            case R.id.card_view3 :
                if(politic_problem_check == 1){
                    ImageView image = findViewById(R.id.image3);
                    TextView text = findViewById(R.id.text3);
                    image.setImageResource(R.drawable.politic_problem);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    politic_problem_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image3);
                    TextView text = findViewById(R.id.text3);
                    image.setImageResource(R.drawable.politic_problem_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    politic_problem_check = 1;
                    break;
                }

            case R.id.card_view4 :
                if(management_money_check == 1){
                    ImageView image = findViewById(R.id.image4);
                    TextView text = findViewById(R.id.text4);
                    image.setImageResource(R.drawable.management_money);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    management_money_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image4);
                    TextView text = findViewById(R.id.text4);
                    image.setImageResource(R.drawable.management_money_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    management_money_check = 1;
                    break;
                }

            case R.id.card_view5 :
                if(science_tech_check == 1){
                    ImageView image = findViewById(R.id.image5);
                    TextView text = findViewById(R.id.text5);
                    image.setImageResource(R.drawable.science_tech);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    science_tech_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image5);
                    TextView text = findViewById(R.id.text5);
                    image.setImageResource(R.drawable.science_tech_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    science_tech_check = 1;
                    break;
                }

            case R.id.card_view6 :
                if(edu_culture_pe_check == 1){
                    ImageView image = findViewById(R.id.image6);
                    TextView text = findViewById(R.id.text6);
                    image.setImageResource(R.drawable.edu_culture_pe);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    edu_culture_pe_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image6);
                    TextView text = findViewById(R.id.text6);
                    image.setImageResource(R.drawable.edu_culture_pe_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    edu_culture_pe_check = 1;
                    break;
                }

            case R.id.card_view7 :
                if(unification_check == 1){
                    ImageView image = findViewById(R.id.image7);
                    TextView text = findViewById(R.id.text7);
                    image.setImageResource(R.drawable.unification);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    unification_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image7);
                    TextView text = findViewById(R.id.text7);
                    image.setImageResource(R.drawable.unification_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    unification_check = 1;
                    break;
                }

            case R.id.card_view8 :
                if(soldier_check == 1){
                    ImageView image = findViewById(R.id.image8);
                    TextView text = findViewById(R.id.text8);
                    image.setImageResource(R.drawable.soldier);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    soldier_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image8);
                    TextView text = findViewById(R.id.text8);
                    image.setImageResource(R.drawable.soldier_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    soldier_check = 1;
                    break;
                }

            case R.id.card_view9 :
                if(administration_safe_Check == 1){
                    ImageView image = findViewById(R.id.image9);
                    TextView text = findViewById(R.id.text9);
                    image.setImageResource(R.drawable.administration_safe);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    administration_safe_Check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image9);
                    TextView text = findViewById(R.id.text9);
                    image.setImageResource(R.drawable.administration_safe_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    administration_safe_Check = 1;
                    break;
                }

            case R.id.card_view10 :
                if(country_food_check == 1){
                    ImageView image = findViewById(R.id.image10);
                    TextView text = findViewById(R.id.text10);
                    image.setImageResource(R.drawable.country_food);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    country_food_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image10);
                    TextView text = findViewById(R.id.text10);
                    image.setImageResource(R.drawable.country_food_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    country_food_check = 1;
                    break;
                }

            case R.id.card_view11 :
                if(venture_company_check == 1){
                    ImageView image = findViewById(R.id.image11);
                    TextView text = findViewById(R.id.text11);
                    image.setImageResource(R.drawable.venture_company);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    venture_company_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image11);
                    TextView text = findViewById(R.id.text11);
                    image.setImageResource(R.drawable.venture_company_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    venture_company_check = 1;
                    break;
                }

            case R.id.card_view12 :
                if(health_welfare_check == 1){
                    ImageView image = findViewById(R.id.image12);
                    TextView text = findViewById(R.id.text12);
                    image.setImageResource(R.drawable.health_welfare);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    health_welfare_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image12);
                    TextView text = findViewById(R.id.text12);
                    image.setImageResource(R.drawable.health_welfare_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    health_welfare_check = 1;
                    break;
                }

            case R.id.card_view13 :
                if(information_check == 1){
                    ImageView image = findViewById(R.id.image13);
                    TextView text = findViewById(R.id.text13);
                    image.setImageResource(R.drawable.information);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    information_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image13);
                    TextView text = findViewById(R.id.text13);
                    image.setImageResource(R.drawable.information_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    information_check = 1;
                    break;
                }

            case R.id.card_view14 :
                if(family_check == 1){
                    ImageView image = findViewById(R.id.image14);
                    TextView text = findViewById(R.id.text14);
                    image.setImageResource(R.drawable.family);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    family_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image14);
                    TextView text = findViewById(R.id.text14);
                    image.setImageResource(R.drawable.family_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    family_check = 1;
                    break;
                }

            case R.id.card_view15 :
                if(environment_check == 1){
                    ImageView image = findViewById(R.id.image15);
                    TextView text = findViewById(R.id.text15);
                    image.setImageResource(R.drawable.environment);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    environment_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image15);
                    TextView text = findViewById(R.id.text15);
                    image.setImageResource(R.drawable.environment_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    environment_check = 1;
                    break;
                }

            case R.id.card_view16 :
                if(traffic_check == 1){
                    ImageView image = findViewById(R.id.image16);
                    TextView text = findViewById(R.id.text16);
                    image.setImageResource(R.drawable.traffic);
                    v.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
                    text.setTextColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    traffic_check = 0;
                    break;
                } else {
                    ImageView image = findViewById(R.id.image16);
                    TextView text = findViewById(R.id.text16);
                    image.setImageResource(R.drawable.traffic_1);
                    v.setBackgroundColor(Color.rgb(0x5c, 0xa2, 0xf2));
                    text.setTextColor(Color.rgb(0xff, 0xff, 0xff));
                    congress_operation_check = 1;
                    traffic_check = 1;
                }

            case R.id.back :
                startActivity(intent);
                break;

            case R.id.choice_end :
                startActivity(intent);
                break;
                //서버 통신 추가
        }
    }
}
