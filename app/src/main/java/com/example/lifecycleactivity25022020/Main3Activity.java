package com.example.lifecycleactivity25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button mBtnScreen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mBtnScreen3 = findViewById(R.id.buttonScreen3);
        mBtnScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Main3Activity.this, MainActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(a);
            }
        });
        Log.d("BBB","onCreate Screen3");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume Screen3");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart Screen3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause Screen3");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop Screen3");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart Screen3");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy Screen3");
    }
}
