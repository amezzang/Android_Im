package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button); // 인터넷 접속 버튼
        Button btn2 = findViewById(R.id.button2); // 전화 걸기 버튼
        Button btn3 = findViewById(R.id.button3); // 메뉴화면으로 전환

        /* onclicklistener + alt+ enter > 필요한메소드 자동으로 추가 */
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://daum.net"));
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-9559-4666"));
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class); // 현재 화면에서 지정된 화면으로 넘기겠다.
                intent.putExtra("name", "김예솔"); // key와 value를 보낸다
                intent.putExtra("age", 21);
                startActivityForResult(intent,101);
                // 101은 어떤 화면으로 부터 왔는지 구분할 수 있는 코드
            }
        });
    }
}
