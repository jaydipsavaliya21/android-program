package com.muproject.mu_android_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity15 extends AppCompatActivity {

    CheckBox cbJava, cbPython, cbKotlin;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15);

        cbJava = findViewById(R.id.cbJava);
        cbPython = findViewById(R.id.cbPython);
        cbKotlin = findViewById(R.id.cbKotlin);
        btnShow = findViewById(R.id.btnShowSelected);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder("Selected: ");
                if(cbJava.isChecked()) result.append("\nJava");
                if(cbPython.isChecked()) result.append("\nPython");
                if(cbKotlin.isChecked()) result.append("\nKotlin");
                
                Toast.makeText(Activity15.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
