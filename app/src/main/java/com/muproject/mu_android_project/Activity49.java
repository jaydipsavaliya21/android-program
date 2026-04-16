package com.muproject.mu_android_project;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity49 extends AppCompatActivity {

    private EditText etPrincipal, etRate, etYears;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_49);

        etPrincipal = findViewById(R.id.etPrincipal);
        etRate = findViewById(R.id.etRate);
        etYears = findViewById(R.id.etYears);
        tvResult = findViewById(R.id.tvResult);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Simple Interest");
        menu.add(0, 2, 0, "Compound Interest");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        try {
            double p = Double.parseDouble(etPrincipal.getText().toString());
            double r = Double.parseDouble(etRate.getText().toString());
            double t = Double.parseDouble(etYears.getText().toString());

            if (item.getItemId() == 1) {
                // Simple interest
                double si = (p * r * t) / 100;
                tvResult.setText("Simple Interest: " + si);
            } else if (item.getItemId() == 2) {
                // Compound interest
                double ci = p * Math.pow(1 + (r / 100), t) - p;
                tvResult.setText("Compound Interest: " + String.format("%.2f", ci));
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Please end valid numbers", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
