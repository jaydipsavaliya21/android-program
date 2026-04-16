package com.muproject.mu_android_project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_33);

        EditText urlEditText = findViewById(R.id.urlEditText);
        Button displayBtn = findViewById(R.id.displayBtn);
        TextView urlDisplayTxt = findViewById(R.id.urlDisplayTxt);

        displayBtn.setOnClickListener(v -> {
            String url = urlEditText.getText().toString();
            urlDisplayTxt.setText("Entered URL: \n" + url);
        });
    }
}
