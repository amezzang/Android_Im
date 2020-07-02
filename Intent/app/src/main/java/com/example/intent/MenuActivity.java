package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    TextView textview;
    TextView textview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        textview = findViewById(R.id.textView); // R은 res폴더 안에 있는 id값을 찾는다.
        textview2 = findViewById(R.id.textView2);

        //intent를 받아와야함
        Intent intent= getIntent(); // putIntent했던게 연결되서 값이 받아와짐.
        String name = intent.getExtras().getString("name");
        int age = intent.getExtras().getInt("age");

        // textview는 string값만 넣을 수 있어서 int를 string으로 변환후 뿌려준다.
        textview.setText(name); // 화면에 뿌려준다
        textview2.setText(String.valueOf(age));

        Button btnBack = findViewById(R.id.button4);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // 현재 엑티비티가 사라지고 전 화면으로 돌아간다.
            }
        });
    }
}
