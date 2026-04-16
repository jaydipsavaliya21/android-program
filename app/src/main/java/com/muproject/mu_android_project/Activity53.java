package com.muproject.mu_android_project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class Activity53 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_53);

        Button btnParse = findViewById(R.id.btnParseJson);
        TextView tvJsonResult = findViewById(R.id.tvJsonResult);

        String sampleJson = "{\"student\": {\"name\": \"John Doe\", \"course\": \"Mobile Programming\", \"grade\": \"A\"}}";

        btnParse.setOnClickListener(v -> {
            try {
                JSONObject jsonObject = new JSONObject(sampleJson);
                JSONObject student = jsonObject.getJSONObject("student");
                String name = student.getString("name");
                String course = student.getString("course");
                String grade = student.getString("grade");

                String parsedOutput = "Parsed Data:\n\nName: " + name + "\nCourse: " + course + "\nGrade: " + grade;
                tvJsonResult.setText(parsedOutput);

            } catch (JSONException e) {
                Toast.makeText(this, "JSON Parsing Error", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        });
    }
}
