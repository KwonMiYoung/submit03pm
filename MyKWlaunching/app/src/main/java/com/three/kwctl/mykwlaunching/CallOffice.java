package com.three.kwctl.mykwlaunching;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CallOffice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_office);
    }

    public void onClick25(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5064"));
        startActivity(intent);
    }   //중앙도서관


    public void onClick26(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5033"));
        startActivity(intent);
    }   //학생복지처

    public void onClick27(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5501"));
        startActivity(intent);
    }   //입학처

    public void onClick28(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5043"));
        startActivity(intent);
    }   //총무처

    public void onClick29(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5051"));
        startActivity(intent);
    }   //관리처

    public void onClick30(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5072"));
        startActivity(intent);
    }   //정보통신처

    public void onClick31(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5101"));
        startActivity(intent);
    }   //전정대

    public void onClick32(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5601"));
        startActivity(intent);
    }   //공과대

    public void onClick33(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5561"));
        startActivity(intent);
    }   //정법대

    public void onClick34(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5302"));
        startActivity(intent);
    }   //경영대

    public void onClick35(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5301"));
        startActivity(intent);
    }   //동북아대

    public void onClick36(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:02-940-5531"));
        startActivity(intent);
    }   //인제니움
}
