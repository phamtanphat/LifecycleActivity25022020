package com.example.lifecycleactivity25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button mBtnScreen2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mBtnScreen2 = findViewById(R.id.buttonScreen2);
        mBtnScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(a);
            }
        });
        Log.d("BBB","onCreate Screen2");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume Screen2");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart Screen2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause Screen2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop Screen2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart Screen2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy Screen2");
    }
}
