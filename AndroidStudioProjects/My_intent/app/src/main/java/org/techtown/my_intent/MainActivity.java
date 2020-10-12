package org.techtown.my_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button next_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next_btn = findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //intentSubActivity로 화면 전환
                Intent i = new Intent(MainActivity.this, IntentSubActivity.class);

                startActivity(i); //지정해놓은 페이지로 화면을 전환
            }
        });



    }//onCreate()
}