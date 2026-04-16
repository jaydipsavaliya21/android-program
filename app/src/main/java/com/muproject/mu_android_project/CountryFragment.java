package com.muproject.mu_android_project;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.Objects;

public class CountryFragment extends Fragment {

    ListView list;

    String countries[]={"India","USA","Canada","Japan","Germany"};

    int flags[]={
            R.drawable.india,
            R.drawable.usa,
            R.drawable.canada,
            R.drawable.japan,
            R.drawable.germany
    };

    CountryListener listener;

    public interface CountryListener{

        void onCountrySelected(int img);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater i, ViewGroup g, Bundle b){

        View v = i.inflate(R.layout.fragment_country,g,false);

        list = v.findViewById(R.id.listCountry);

        ArrayAdapter<String> ad =
                new ArrayAdapter<>(requireActivity(),
                        android.R.layout.simple_list_item_1,
                        countries);

        list.setAdapter(ad);

        list.setOnItemClickListener((a,view,pos,id)->{

            listener.onCountrySelected(flags[pos]);
        });

        return v;
    }

    @Override
    public void onAttach(@NonNull Context c){

        super.onAttach(c);

        listener=(CountryListener)c;
    }
}