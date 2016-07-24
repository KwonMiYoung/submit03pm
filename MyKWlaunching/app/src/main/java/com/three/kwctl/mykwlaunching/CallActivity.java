package com.three.kwctl.mykwlaunching;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CallActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        ImageButton main_button_simple_list1 = (ImageButton) findViewById(R.id.imageButton31); //전화 걸기 버튼
        main_button_simple_list1.setOnClickListener(this);

        ImageButton main_button_simple_list2 = (ImageButton) findViewById(R.id.imageButton32); //전화 걸기 버튼
        main_button_simple_list2.setOnClickListener(this);

        ImageButton main_button_simple_list3 = (ImageButton) findViewById(R.id.imageButton33); //전화 걸기 버튼
        main_button_simple_list3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton31:
                Intent intentSimpleList1 = new Intent(this,CallSubject.class);
                startActivity(intentSimpleList1);
                break;
            case R.id.imageButton32:
                Intent intentSimpleList2 = new Intent(this,CallOffice.class);
                startActivity(intentSimpleList2);
                break;
            case R.id.imageButton33:
                Intent intentSimpleList3 = new Intent(this,CallOther.class);
                startActivity(intentSimpleList3);
                break;
        }
    }
}
