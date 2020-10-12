package org.techtown.my_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    // 리스트 뷰에 표현될 배열
    String[] arr = {"java", "android", "spring", "jsp", "database"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.my_listview);

        //선택 위젯들은 Adapter 클래스를 통해 내용을 지정
        //1. context : 화면 제어권자
        //2. layout : 리스트 뷰 항목 하나의 디자인
        //3. 참조파일 : 리스트 뷰에서 보여줄 스트링 배열

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (MainActivity.this,
                android.R.layout.simple_list_item_checked,
                arr);
        //생성된 어댑터를 listview에 세팅
        list.setAdapter(adapter);


    }//onCreate()
}