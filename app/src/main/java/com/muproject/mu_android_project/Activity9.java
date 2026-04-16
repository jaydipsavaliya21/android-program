package com.muproject.mu_android_project;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class Activity9 extends AppCompatActivity implements CountryFragment.CountryListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.fragment1,new CountryFragment());
        ft.replace(R.id.fragment2,new FlagFragment());

        ft.commit();
    }

    @Override
    public void onCountrySelected(int img){

        FlagFragment f = (FlagFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment2);

        assert f != null;
        f.changeFlag(img);
    }
}