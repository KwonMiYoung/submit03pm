package com.three.kwctl.mykwlaunching;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CallOther extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_other);
    }

    public void onClick40(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-8650"));
        startActivity(intent);
    }   //푸드코트

    public void onClick41(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5711"));
        startActivity(intent);
    }   //로봇연구회

    public void onClick42(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5039"));
        startActivity(intent);
    }   //예비군

    public void onClick43(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5306"));
        startActivity(intent);
    }   //언어교육원

    public void onClick44(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5282"));
        startActivity(intent);
    }   //기숙사

    public void onClick45(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5000"));
        startActivity(intent);
    }   //총장실

    public void onClick48(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5034"));
        startActivity(intent);
    }   //보건실

    public void onClick37(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5396"));
        startActivity(intent);
    }   //우체국

    public void onClick38(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5044"));
        startActivity(intent);
    }   //우편물실

    public void onClick39(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-8168"));
        startActivity(intent);
    }   //하나은행




}
