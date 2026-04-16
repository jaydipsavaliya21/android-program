package com.muproject.mu_android_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_19);

        final EditText editText = findViewById(R.id.editText);
        final Button button = findViewById(R.id.btnSubmit);
        final TextView textView = findViewById(R.id.txtDisplay);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                if (!name.isEmpty()) {
                    textView.setText("Hello, " + name + "!");
                } else {
                    textView.setText("Please enter your name");
                }
            }
        });
    }
}
