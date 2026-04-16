package com.muproject.mu_android_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity7 extends AppCompatActivity {

    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
    }

    public void verifyUser(View v){

        String u = user.getText().toString();
        String p = pass.getText().toString();

        // simple verification condition
        if(u.length()>0 && p.length()>0){

            Intent i = new Intent(Activity7.this, Activity7Result.class);

            i.putExtra("username",u);
            i.putExtra("password",p);

            startActivity(i);
        }
        else{
            Toast.makeText(this,"Enter Username and Password",Toast.LENGTH_SHORT).show();
        }
    }
}