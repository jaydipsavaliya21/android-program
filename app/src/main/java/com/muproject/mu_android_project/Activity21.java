package com.muproject.mu_android_project;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity21 extends AppCompatActivity {

    String[] countries = {"India", "USA", "UK", "Canada", "Germany", "France", "Japan", "Italy", "Australia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21);

        AutoCompleteTextView autoTextView = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, countries);
        autoTextView.setThreshold(1);
        autoTextView.setAdapter(adapter);
    }
}
