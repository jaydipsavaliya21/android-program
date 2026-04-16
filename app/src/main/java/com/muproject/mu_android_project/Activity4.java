package com.muproject.mu_android_project;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        editText = findViewById(R.id.editText);
    }

    public void showToast(View view) {

        String data = editText.getText().toString();

        Toast.makeText(
                Activity4.this,
                data,
                Toast.LENGTH_LONG
        ).show();
    }
}