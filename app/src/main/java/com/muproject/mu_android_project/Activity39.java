package com.muproject.mu_android_project;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_39);

        EditText hourInput = findViewById(R.id.hourInput);
        EditText minuteInput = findViewById(R.id.minuteInput);
        Button setAlarmBtn = findViewById(R.id.setAlarmBtn);

        setAlarmBtn.setOnClickListener(v -> {
            try {
                int hour = Integer.parseInt(hourInput.getText().toString());
                int min = Integer.parseInt(minuteInput.getText().toString());

                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent.putExtra(AlarmClock.EXTRA_HOUR, hour);
                intent.putExtra(AlarmClock.EXTRA_MINUTES, min);
                intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Test Alarm from App");
                
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "No Alarm app found", Toast.LENGTH_SHORT).show();
                }
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Enter valid time", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
