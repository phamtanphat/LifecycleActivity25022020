package com.example.lifecycleactivity25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnScreen1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","onCreate Screen1");
        mBtnScreen1 = findViewById(R.id.buttonScreen1);

        mBtnScreen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume Screen1");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart Screen1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause Screen1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop Screen1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart Screen1");
    }
}
