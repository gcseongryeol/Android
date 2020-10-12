package org.techtown.handleracitivty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt_count;
    Button btn_start, btn_stop;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_count = findViewById(R.id.txt_count);
        btn_start = findViewById(R.id.btn_start);
        btn_stop = findViewById(R.id.btn_stop);
        btn_start.setOnClickListener(click);
        btn_stop.setOnClickListener(click);

    }//onCreate()

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {

                case R.id.btn_start:
                    //핸들러 실행
                    handler.sendEmptyMessage(0);
                    break;

                case R.id.btn_stop:
                    //핸들러 정지
                    break;

            }//switch
        }
    };

    //카운트를 증가시키는 핸들러
    Handler handler = new Handler() {

        @Override
        public void handleMessage(@NonNull Message msg) {
//            super.handleMessage(msg);

            txt_count.setText( String.valueOf(++count) );
        }
    };


}