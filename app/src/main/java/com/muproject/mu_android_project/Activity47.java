package com.muproject.mu_android_project;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Activity47 extends AppCompatActivity {

    private static final String FILE_NAME = "internal_demo.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_47);

        EditText etInternalData = findViewById(R.id.etInternalData);
        Button btnSaveInternal = findViewById(R.id.btnSaveInternal);
        Button btnLoadInternal = findViewById(R.id.btnLoadInternal);
        TextView tvInternalData = findViewById(R.id.tvInternalData);

        btnSaveInternal.setOnClickListener(v -> {
            String data = etInternalData.getText().toString();
            try {
                FileOutputStream fos = openFileOutput(FILE_NAME, Context.MODE_PRIVATE);
                fos.write(data.getBytes());
                fos.close();
                Toast.makeText(this, "Saved to Internal Storage", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnLoadInternal.setOnClickListener(v -> {
            try {
                FileInputStream fis = openFileInput(FILE_NAME);
                int c;
                StringBuilder temp = new StringBuilder();
                while ((c = fis.read()) != -1) {
                    temp.append(Character.toString((char) c));
                }
                fis.close();
                tvInternalData.setText("Loaded: " + temp.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
