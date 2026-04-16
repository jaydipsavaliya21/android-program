package com.muproject.mu_android_project;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity5 extends AppCompatActivity {

    void show(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        show("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        show("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        show("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        show("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        show("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        show("onDestroy");
    }
}