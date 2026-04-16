package com.muproject.mu_android_project;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity22 extends AppCompatActivity {

    String[] skills = {"Android", "Java", "Kotlin", "Python", "Swift", "C++", "JavaScript", "HTML", "CSS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_22);

        MultiAutoCompleteTextView multiAutoTextView = findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, skills);
        multiAutoTextView.setThreshold(1);
        multiAutoTextView.setAdapter(adapter);
        multiAutoTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
