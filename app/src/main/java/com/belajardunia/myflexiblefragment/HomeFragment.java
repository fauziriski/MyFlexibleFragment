package com.belajardunia.myflexiblefragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment implements View.OnClickListener{


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button btnCategory = (Button)view.findViewById(R.id.btn_category);
        btnCategory.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View  v){
        if (v.getId() == R.id.btn_category){
            CategoryFragment
        }
    }

}
