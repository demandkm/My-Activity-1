package com.vandy.kaidemandante.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("msg", "Create!");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("msg2", "Start!");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("msg3", "Resume!");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("msg4", "Pause!");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("msg5", "Stop!");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d("msg6", "Restart!");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("msg7", "Destroy!");
    }
}
