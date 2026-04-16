package com.muproject.mu_android_project;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class Activity35 extends AppCompatActivity {

    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_35);

        mainLayout = findViewById(R.id.colorLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Red");
        menu.add(0, 2, 0, "Green");
        menu.add(0, 3, 0, "Blue");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                mainLayout.setBackgroundColor(Color.RED);
                return true;
            case 2:
                mainLayout.setBackgroundColor(Color.GREEN);
                return true;
            case 3:
                mainLayout.setBackgroundColor(Color.BLUE);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
