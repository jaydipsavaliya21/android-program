package com.muproject.mu_android_project;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity25 extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progressStatus = 0;
    private TextView textView;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_25);

        progressBar = findViewById(R.id.progressBar);
        textView = findViewById(R.id.progressTxt);
        Button btnStart = findViewById(R.id.btnStartProgress);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressStatus = 0;
                new Thread(new Runnable() {
                    public void run() {
                        while (progressStatus < 100) {
                            progressStatus += 1;
                            handler.post(new Runnable() {
                                public void run() {
                                    progressBar.setProgress(progressStatus);
                                    textView.setText(progressStatus + "/" + progressBar.getMax());
                                }
                            });
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });
    }
}
