package org.techtown.my_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//onCreate()

    //액티비티 타이틀바에 메뉴 호출 기능을 추가


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.add:
                //makeText( Context, title, 호출시간 );
                Toast.makeText(MainActivity.this, "add button click", Toast.LENGTH_SHORT).show();
                break;

            case R.id.edit:
                Toast.makeText(MainActivity.this, "edit button click", Toast.LENGTH_SHORT).show();
                break;

            case R.id.email:
                Toast.makeText(MainActivity.this, "email button click", Toast.LENGTH_SHORT).show();
                break;

        }//switch
        return super.onOptionsItemSelected(item);
    }
}