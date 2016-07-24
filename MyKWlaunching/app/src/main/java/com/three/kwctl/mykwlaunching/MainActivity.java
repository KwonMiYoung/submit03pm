package com.three.kwctl.mykwlaunching;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton button1 = (ImageButton) findViewById(R.id.btn_campus);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://info.kw.ac.kr"));
                startActivity(intent);
            }
        }); //1번 유캠퍼스

        ImageButton button2 = (ImageButton) findViewById(R.id.btn_notice);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kw.ac.kr/sub/plaza/mn1bbsLA.do?bbsId=notice"));
                startActivity(intent);
            }
        }); //2번 공지사항

        ImageButton button3 = (ImageButton) findViewById(R.id.btn_lunch);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.kw.ac.kr/menu.php"));
                startActivity(intent);
            }
        }); //3번 식단

        ImageButton button4 = (ImageButton) findViewById(R.id.btn_library);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kupis.kw.ac.kr/"));
                startActivity(intent);
            }
        }); //4번 도서관


        ImageButton button5 = (ImageButton) findViewById(R.id.btn_shop);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/kw1934/120190184246"));
                startActivity(intent);
            }
        }); //5번 주변식당

        ImageButton button6 = (ImageButton) findViewById(R.id.btn_phone);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kw.ac.kr/sub/info/info14_1NP.do"));
                startActivity(intent);
            }
        }); //6번 전화번호

        ImageButton button7 = (ImageButton) findViewById(R.id.btn_schedule);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kw.ac.kr/sub/life/uniguide1_1CP.do"));
                startActivity(intent);
            }
        }); //7번 학사일정

        ImageButton button8 = (ImageButton) findViewById(R.id.btn_facebook);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/Kwangwoonuniversity"));
                startActivity(intent);
            }
        }); //8번 페이스북

        ImageButton button9 = (ImageButton) findViewById(R.id.btn_card);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mkupis.kw.ac.kr/"));
                startActivity(intent);
            }
        }); //9번 학생증

        Button main_button_simple_list1 = (Button) findViewById(R.id.button4); //전화 걸기 버튼
        main_button_simple_list1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button4:
                Intent intentSimpleList1 = new Intent(this, CallActivity.class);
                startActivity(intentSimpleList1);
                break;
        }
    }
}
