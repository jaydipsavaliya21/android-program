package com.muproject.mu_android_project;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity54 extends AppCompatActivity {

    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_54);

        dbHelper = new DatabaseHelper(this);

        EditText etDocId = findViewById(R.id.etDocId);
        EditText etFirstName = findViewById(R.id.etFirstName);
        EditText etLastName = findViewById(R.id.etLastName);
        EditText etMobile = findViewById(R.id.etMobile);
        EditText etAddress = findViewById(R.id.etAddress);
        EditText etCity = findViewById(R.id.etCity);
        EditText etSpecialization = findViewById(R.id.etSpecialization);
        
        Button btnSubmit = findViewById(R.id.btnSubmitDoc);
        Button btnGoSearch = findViewById(R.id.btnGoSearch);

        btnSubmit.setOnClickListener(v -> {
            String qId = etDocId.getText().toString();
            String qFname = etFirstName.getText().toString();
            String qLname = etLastName.getText().toString();
            String qMob = etMobile.getText().toString();
            String qAdd = etAddress.getText().toString();
            String qCity = etCity.getText().toString();
            String qSpec = etSpecialization.getText().toString();

            if (qId.isEmpty()) {
                Toast.makeText(this, "Doctor ID is required", Toast.LENGTH_SHORT).show();
                return;
            }

            SQLiteDatabase db = dbHelper.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put(DatabaseHelper.COLUMN_ID, qId);
            values.put(DatabaseHelper.COLUMN_FNAME, qFname);
            values.put(DatabaseHelper.COLUMN_LNAME, qLname);
            values.put(DatabaseHelper.COLUMN_MOB, qMob);
            values.put(DatabaseHelper.COLUMN_ADD, qAdd);
            values.put(DatabaseHelper.COLUMN_CITY, qCity);
            values.put(DatabaseHelper.COLUMN_SPECIALIZATION, qSpec);

            long result = db.insert(DatabaseHelper.TABLE_DOCTOR, null, values);
            if (result == -1) {
                Toast.makeText(this, "Error inserting data", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Data Saved successfully!", Toast.LENGTH_SHORT).show();
                etDocId.setText("");
                etFirstName.setText("");
                etLastName.setText("");
                etMobile.setText("");
                etAddress.setText("");
                etCity.setText("");
                etSpecialization.setText("");
            }
        });

        btnGoSearch.setOnClickListener(v -> {
            startActivity(new Intent(Activity54.this, Activity54Search.class));
        });
    }
}
