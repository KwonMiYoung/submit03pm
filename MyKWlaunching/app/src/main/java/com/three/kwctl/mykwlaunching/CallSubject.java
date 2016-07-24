package com.three.kwctl.mykwlaunching;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CallSubject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_subject);
    }

    public void onClick17(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5350"));
        startActivity(intent);
    }   //국어국문학과

    public void onClick18(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5360"));
        startActivity(intent);
    }   //영어영문학과

    public void onClick19(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5370"));
        startActivity(intent);
    }   //미디어영상학부

    public void onClick20(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5420"));
        startActivity(intent);
    }   //산업심리학과

    public void onClick21(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5330"));
        startActivity(intent);
    }   //행정학과

    public void onClick22(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5340"));
        startActivity(intent);
    }   //법학부

    public void onClick23(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5485"));
        startActivity(intent);
    }   //국제학부

    public void onClick24(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5302"));
        startActivity(intent);
    }   //경영학부

    public void onClick10(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5170"));
        startActivity(intent);
    }   //화학공학과

    public void onClick11(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5180"));
        startActivity(intent);
    }   //환경공학과

    public void onClick12(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5191"));
        startActivity(intent);
    }   //건축학과


    public void onClick13(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5220"));
        startActivity(intent);
    }   //수학과

    public void onClick14(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5230"));
        startActivity(intent);
    }   //전자바이오물리학과

    public void onClick15(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5240"));
        startActivity(intent);
    }   //화학과

    public void onClick16(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5206"));
        startActivity(intent);
    }   //생활체육학과

    public void onClick2(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5440"));
        startActivity(intent);
    }   //전자통신공학과

    public void onClick3(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5110"));
        startActivity(intent);
    }   //전자융합공학과

    public void onClick4(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5120"));
        startActivity(intent);
    }   //컴퓨터공학과

    public void onClick5(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5210"));
        startActivity(intent);
    }   //컴퓨터소프트웨어공학과

    public void onClick6(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5140"));
        startActivity(intent);
    }   //전기공학과

    public void onClick7(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5160"));
        startActivity(intent);
    }   //전자재료공학과

    public void onClick8(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5150"));
        startActivity(intent);
    }   //로봇학부

    public void onClick9(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5190"));
        startActivity(intent);
    }   //건축공학과

    public void onClick1(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5295"));
        startActivity(intent);
    }   //전자공학과

}
