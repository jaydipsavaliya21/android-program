package com.muproject.mu_android_project;

import android.os.Bundle;
import android.view.*;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;

public class FlagFragment extends Fragment {

    ImageView img;

    @Override
    public View onCreateView(LayoutInflater i, ViewGroup g, Bundle b){

        View v = i.inflate(R.layout.fragment_flag,g,false);

        img = v.findViewById(R.id.flagImg);

        return v;
    }

    public void changeFlag(int id){

        img.setImageResource(id);
    }
}