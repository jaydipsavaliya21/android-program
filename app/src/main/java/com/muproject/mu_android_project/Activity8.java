package com.muproject.mu_android_project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity8 extends AppCompatActivity {

    EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        phone = findViewById(R.id.phone);
    }

    public void callNumber(View v){

        String number = phone.getText().toString();

        if(!number.isEmpty()){

            Intent i = new Intent(Intent.ACTION_DIAL);

            i.setData(Uri.parse("tel:"+number));

            startActivity(i);
        }
        else{

            Toast.makeText(this,"Enter phone number",Toast.LENGTH_SHORT).show();
        }
    }
}