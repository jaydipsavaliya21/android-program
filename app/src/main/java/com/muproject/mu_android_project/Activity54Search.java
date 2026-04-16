package com.muproject.mu_android_project;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity54Search extends AppCompatActivity {

    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_54_search);

        dbHelper = new DatabaseHelper(this);

        EditText etSearchId = findViewById(R.id.etSearchId);
        Button btnSearchDoc = findViewById(R.id.btnSearchDoc);
        TextView tvDocResult = findViewById(R.id.tvDocResult);

        btnSearchDoc.setOnClickListener(v -> {
            String searchId = etSearchId.getText().toString();
            if (searchId.isEmpty()) {
                Toast.makeText(this, "Enter Doctor ID to search", Toast.LENGTH_SHORT).show();
                return;
            }

            SQLiteDatabase db = dbHelper.getReadableDatabase();
            Cursor cursor = db.query(DatabaseHelper.TABLE_DOCTOR, null, DatabaseHelper.COLUMN_ID + "=?", new String[]{searchId}, null, null, null);

            if (cursor != null && cursor.moveToFirst()) {
                StringBuilder details = new StringBuilder();
                details.append("ID: ").append(cursor.getString(0)).append("\n");
                details.append("First Name: ").append(cursor.getString(1)).append("\n");
                details.append("Last Name: ").append(cursor.getString(2)).append("\n");
                details.append("Mobile: ").append(cursor.getString(3)).append("\n");
                details.append("Address: ").append(cursor.getString(4)).append("\n");
                details.append("City: ").append(cursor.getString(5)).append("\n");
                details.append("Specialization: ").append(cursor.getString(6));

                tvDocResult.setText(details.toString());
                cursor.close();
            } else {
                tvDocResult.setText("Doctor not found!");
            }
        });
    }
}
