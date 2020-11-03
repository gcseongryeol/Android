package kr.ryeol.ryeol_project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView1; TextView textView2; TextView textView3; TextView textView4; TextView textView5; TextView textView6; TextView textView7;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        renderNumber(getRandomList());




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                renderNumber(getRandomList());

            }
        });

    }

    public void init() {

        textView1 = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);
        textView3 = findViewById(R.id.text3);
        textView4 = findViewById(R.id.text4);
        textView5 = findViewById(R.id.text5);
        textView6 = findViewById(R.id.text6);
        button = findViewById(R.id.btn);

    }

    public void renderNumber(ArrayList<Integer> list) {

        textView1.setText(String.valueOf(list.get(0)));
        textView1.setBackgroundResource(getNumberColor(list.get(0)));
        textView2.setText(String.valueOf(list.get(1)));
        textView2.setBackgroundResource(getNumberColor(list.get(1)));
        textView3.setText(String.valueOf(list.get(2)));
        textView3.setBackgroundResource(getNumberColor(list.get(2)));
        textView4.setText(String.valueOf(list.get(3)));
        textView4.setBackgroundResource(getNumberColor(list.get(3)));
        textView5.setText(String.valueOf(list.get(4)));
        textView5.setBackgroundResource(getNumberColor(list.get(4)));
        textView6.setText(String.valueOf(list.get(5)));
        textView6.setBackgroundResource(getNumberColor(list.get(5)));

    }

    public ArrayList<Integer> getRandomList() {
        ArrayList<Integer> randList = new ArrayList<Integer>();

        Random random = new Random();

        int randNumber = 0;

        for(int i = 0; i < 6; i++) {
            randNumber = random.nextInt(45)+1;
            if(!randList.isEmpty()) { // 값이 없으면 true 값이 있으면 false
                if(randList.contains(randNumber)) {
                    --i;
                    continue;
                }
            }
            randList.add(randNumber);
        }

        return randList;
    }

    public int getNumberColor(int num){
        if(num <= 10) {
            return R.drawable.ball;
        } else if(num <= 20) {
            return R.drawable.ball2;
        } else if(num <= 30) {
            return R.drawable.ball3;
        } else if(num <= 40) {
            return R.drawable.ball4;
        } else
            return R.drawable.ball5;
    }
}