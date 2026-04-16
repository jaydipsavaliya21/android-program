package com.muproject.mu_android_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_23);

        final DatePicker datePicker = findViewById(R.id.datePicker);
        Button btnGetDate = findViewById(R.id.btnGetDate);

        btnGetDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1;
                int year = datePicker.getYear();
                Toast.makeText(Activity23.this, "Selected Date: " + day + "/" + month + "/" + year, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
