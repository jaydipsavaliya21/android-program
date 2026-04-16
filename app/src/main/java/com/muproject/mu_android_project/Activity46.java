package com.muproject.mu_android_project;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity46 extends AppCompatActivity {

    private static final String SHARED_PREF_NAME = "demoPref";
    private static final String KEY_DATA = "dataKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_46);

        EditText etSharedData = findViewById(R.id.etSharedData);
        Button btnSavePref = findViewById(R.id.btnSavePref);
        Button btnLoadPref = findViewById(R.id.btnLoadPref);
        TextView tvSharedData = findViewById(R.id.tvSharedData);

        btnSavePref.setOnClickListener(v -> {
            String data = etSharedData.getText().toString();
            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(KEY_DATA, data);
            editor.apply();
            Toast.makeText(this, "Data Saved in SharedPreferences", Toast.LENGTH_SHORT).show();
        });

        btnLoadPref.setOnClickListener(v -> {
            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
            String loadedData = sharedPreferences.getString(KEY_DATA, "No data available");
            tvSharedData.setText("Loaded Data: " + loadedData);
        });
    }
}
