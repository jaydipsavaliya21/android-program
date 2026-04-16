package com.muproject.mu_android_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void openScreen(View v){
        int id = v.getId();

        if(id == R.id.btn1)
            startActivity(new Intent(this, Activity1.class));

        else if(id == R.id.btn2)
            startActivity(new Intent(this, Activity2.class));

        else if(id == R.id.btn3)
            startActivity(new Intent(this, Activity3.class));

        else if(id == R.id.btn4)
            startActivity(new Intent(this, Activity4.class));

        else if(id == R.id.btn5)
            startActivity(new Intent(this, Activity5.class));

            // remaining buttons ready
        else if(id == R.id.btn6)
            startActivity(new Intent(this, Activity6.class));

        else if(id == R.id.btn7)
            startActivity(new Intent(this, Activity7.class));

        else if(id == R.id.btn8)
            startActivity(new Intent(this, Activity8.class));

        else if(id == R.id.btn9)
            startActivity(new Intent(this, Activity9.class));

        else if(id == R.id.btn10)
            startActivity(new Intent(this, Activity10.class));

        else if(id == R.id.btn11)
            startActivity(new Intent(this, Activity11.class));

        else if(id == R.id.btn12)
            startActivity(new Intent(this, Activity12.class));

        else if(id == R.id.btn13)
            startActivity(new Intent(this, Activity13.class));

        else if(id == R.id.btn14)
            startActivity(new Intent(this, Activity14.class));

        else if(id == R.id.btn15)
            startActivity(new Intent(this, Activity15.class));

        else if(id == R.id.btn16)
            startActivity(new Intent(this, Activity16.class));

        else if(id == R.id.btn17)
            startActivity(new Intent(this, Activity17.class));

        else if(id == R.id.btn18)
            startActivity(new Intent(this, Activity18.class));

        else if(id == R.id.btn19)
            startActivity(new Intent(this, Activity19.class));

        else if(id == R.id.btn20)
            startActivity(new Intent(this, Activity20.class));

        else if(id == R.id.btn21)
            startActivity(new Intent(this, Activity21.class));

        else if(id == R.id.btn22)
            startActivity(new Intent(this, Activity22.class));

        else if(id == R.id.btn23)
            startActivity(new Intent(this, Activity23.class));

        else if(id == R.id.btn24)
            startActivity(new Intent(this, Activity24.class));

        else if(id == R.id.btn25)
            startActivity(new Intent(this, Activity25.class));

        else if(id == R.id.btn26)
            startActivity(new Intent(this, Activity26.class));

        else if(id == R.id.btn27)
            startActivity(new Intent(this, Activity27.class));

        else if(id == R.id.btn28)
            startActivity(new Intent(this, Activity28.class));

        else if(id == R.id.btn29)
            startActivity(new Intent(this, Activity29.class));

        else if(id == R.id.btn30)
            startActivity(new Intent(this, Activity30.class));

        else if(id == R.id.btn31)
            startActivity(new Intent(this, Activity31.class));

        else if(id == R.id.btn32)
            startActivity(new Intent(this, Activity32.class));

        else if(id == R.id.btn33)
            startActivity(new Intent(this, Activity33.class));

        else if(id == R.id.btn34)
            startActivity(new Intent(this, Activity34.class));

        else if(id == R.id.btn35)
            startActivity(new Intent(this, Activity35.class));

        else if(id == R.id.btn36)
            startActivity(new Intent(this, Activity36.class));

        else if(id == R.id.btn37)
            startActivity(new Intent(this, Activity37.class));

        else if(id == R.id.btn38)
            startActivity(new Intent(this, Activity38.class));

        else if(id == R.id.btn39)
            startActivity(new Intent(this, Activity39.class));

        else if(id == R.id.btn40)
            startActivity(new Intent(this, Activity40.class));

        else if(id == R.id.btn41)
            startActivity(new Intent(this, Activity41.class));

        else if(id == R.id.btn42)
            startActivity(new Intent(this, Activity42.class));

        else if(id == R.id.btn43)
            startActivity(new Intent(this, Activity43.class));

        else if(id == R.id.btn44)
            startActivity(new Intent(this, Activity44.class));

        else if(id == R.id.btn45)
            startActivity(new Intent(this, Activity45.class));

        else if(id == R.id.btn46)
            startActivity(new Intent(this, Activity46.class));

        else if(id == R.id.btn47)
            startActivity(new Intent(this, Activity47.class));

        else if(id == R.id.btn48)
            startActivity(new Intent(this, Activity48.class));

        else if(id == R.id.btn49)
            startActivity(new Intent(this, Activity49.class));

        else if(id == R.id.btn50)
            startActivity(new Intent(this, Activity50.class));

        else if(id == R.id.btn51)
            startActivity(new Intent(this, Activity51.class));

        else if(id == R.id.btn52)
            startActivity(new Intent(this, Activity52.class));

        else if(id == R.id.btn53)
            startActivity(new Intent(this, Activity53.class));

        else if(id == R.id.btn54)
            startActivity(new Intent(this, Activity54.class));

        // end of 54 activities
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}