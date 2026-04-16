package com.muproject.mu_android_project;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity10 extends AppCompatActivity {

    EditText n1,n2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        res = findViewById(R.id.result);
    }

    double get1(){
        return Double.parseDouble(n1.getText().toString());
    }

    double get2(){
        return Double.parseDouble(n2.getText().toString());
    }

    @SuppressLint("SetTextI18n")
    public void add(View v){
        res.setText("Result : " + (get1()+get2()));
    }

    @SuppressLint("SetTextI18n")
    public void sub(View v){
        res.setText("Result : " + (get1()-get2()));
    }

    @SuppressLint("SetTextI18n")
    public void mul(View v){
        res.setText("Result : " + (get1()*get2()));
    }

    @SuppressLint("SetTextI18n")
    public void div(View v){

        if(get2()==0){

            Toast.makeText(this,"Cannot divide by zero",Toast.LENGTH_SHORT).show();
            return;
        }

        res.setText("Result : " + (get1()/get2()));
    }

    @SuppressLint("SetTextI18n")
    public void mod(View v){
        res.setText("Result : " + (get1()%get2()));
    }

    @SuppressLint("SetTextI18n")
    public void clear(View v){

        n1.setText("");
        n2.setText("");
        res.setText("Result");
    }
}