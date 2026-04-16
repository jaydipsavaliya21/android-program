package com.muproject.mu_android_project;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity43 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_43);

        AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        Button btnNormal = findViewById(R.id.btnNormal);
        Button btnSilent = findViewById(R.id.btnSilent);
        Button btnVibrate = findViewById(R.id.btnVibrate);

        btnNormal.setOnClickListener(v -> {
            audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
            Toast.makeText(this, "Normal Mode", Toast.LENGTH_SHORT).show();
        });

        // Might need Do Not Disturb permission on newer devices for Silent/Vibrate
        try {
            btnSilent.setOnClickListener(v -> {
                audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
                Toast.makeText(this, "Silent Mode", Toast.LENGTH_SHORT).show();
            });

            btnVibrate.setOnClickListener(v -> {
                audioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                Toast.makeText(this, "Vibrate Mode", Toast.LENGTH_SHORT).show();
            });
        } catch (Exception e) {
            Toast.makeText(this, "Permission restricted for mode change", Toast.LENGTH_SHORT).show();
        }
    }
}
