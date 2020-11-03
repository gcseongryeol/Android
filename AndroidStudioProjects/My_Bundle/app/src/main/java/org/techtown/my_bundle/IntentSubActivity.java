package org.techtown.my_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IntentSubActivity extends AppCompatActivity {

    TextView text_name, text_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_sub);

        text_name = findViewById(R.id.text_name);
        text_age = findViewById(R.id.text_age);

        //main에서 넘겨준 intent정보를 sub에서 받는다.
        Intent i = getIntent();

//        String name = i.getStringExtra("m_name");
//        String age = i.getStringExtra("m_age");

        //intent에서 bundle추출
        Bundle bundle = i.getExtras();
        String name = bundle.getString("m_name");
        String age = bundle.getString("m_age");

        text_name.setText(name);
        text_age.setText(age);

    }//onCreate()
}