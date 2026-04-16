package com.muproject.mu_android_project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Activity48 extends AppCompatActivity {

    private static final String FILE_NAME = "external_demo.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_48);

        EditText etExternalData = findViewById(R.id.etExternalData);
        Button btnSaveExternal = findViewById(R.id.btnSaveExternal);
        Button btnLoadExternal = findViewById(R.id.btnLoadExternal);
        TextView tvExternalData = findViewById(R.id.tvExternalData);

        btnSaveExternal.setOnClickListener(v -> {
            String data = etExternalData.getText().toString();
            try {
                File externalFile = new File(getExternalFilesDir(null), FILE_NAME);
                FileOutputStream fos = new FileOutputStream(externalFile);
                fos.write(data.getBytes());
                fos.close();
                Toast.makeText(this, "Saved to External Storage", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnLoadExternal.setOnClickListener(v -> {
            try {
                File externalFile = new File(getExternalFilesDir(null), FILE_NAME);
                if(externalFile.exists()) {
                    FileInputStream fis = new FileInputStream(externalFile);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        sb.append(line).append("\n");
                    }
                    fis.close();
                    tvExternalData.setText("Loaded: " + sb.toString());
                } else {
                    tvExternalData.setText("File does not exist");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
