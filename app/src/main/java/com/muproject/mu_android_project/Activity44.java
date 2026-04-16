package com.muproject.mu_android_project;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Activity44 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_44);

        Button btnShowAlert = findViewById(R.id.btnShowAlert);

        btnShowAlert.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("Alert Dialog Demo")
                    .setMessage("This is an example of an AlertDialog. Do you want to proceed?")
                    .setPositiveButton("Yes", (dialog, which) -> {
                        Toast.makeText(Activity44.this, "Clicked Yes", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton("No", (dialog, which) -> {
                        Toast.makeText(Activity44.this, "Clicked No", Toast.LENGTH_SHORT).show();
                    })
                    .show();
        });
    }
}
