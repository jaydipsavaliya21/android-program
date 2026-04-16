package com.muproject.mu_android_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_24);

        final TimePicker timePicker = findViewById(R.id.timePicker);
        Button btnGetTime = findViewById(R.id.btnGetTime);

        btnGetTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();
                Toast.makeText(Activity24.this, "Selected Time: " + hour + ":" + minute, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
