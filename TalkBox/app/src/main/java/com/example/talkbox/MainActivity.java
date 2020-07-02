package com.example.talkbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // 버튼을 클릭했을 때 showMessage를 실행한다.
                showMessage();
            }
        });
    }

// 함수로 구성만 설정
    public void showMessage(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("뿅");
        builder.setMessage("종료하시겠습니까?");
        builder.setIcon(android.R.drawable.ic_dialog_alert); // 목적 : 아이콘나오게하는거 (꾸밈)
        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // '예'를 눌렀을 때 동작
                Toast.makeText(getApplicationContext(), "예버튼눌림", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // '아니오'
                Toast.makeText(getApplicationContext(), "아니오버튼눌림", Toast.LENGTH_SHORT).show();
            }
        });

        // 화면에 띄워주기
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}
