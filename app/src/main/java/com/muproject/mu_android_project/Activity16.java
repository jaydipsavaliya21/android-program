package com.muproject.mu_android_project;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_16);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        if (checked) {
            int id = view.getId();
            if (id == R.id.radio_ind) {
                Toast.makeText(this, "India Selected", Toast.LENGTH_SHORT).show();
            } else if (id == R.id.radio_usa) {
                Toast.makeText(this, "USA Selected", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
