package com.muproject.mu_android_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity6 extends AppCompatActivity {

    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
    }

    public void loginCheck(View v){

        String u = user.getText().toString();
        String p = pass.getText().toString();

        if(u.equals("admin") && p.equals("1234")){

            Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show();

            Intent i = new Intent(Activity6.this, Activity6Success.class);
            i.putExtra("username", u);

            startActivity(i);
        }
        else{
            Toast.makeText(this,"Invalid Username or Password",Toast.LENGTH_SHORT).show();
        }
    }
}