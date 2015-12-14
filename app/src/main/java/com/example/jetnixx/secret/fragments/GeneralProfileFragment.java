package com.example.jetnixx.secret.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jetnixx.secret.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GeneralProfileFragment extends Fragment {


    public GeneralProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_general_profile, container, false);
    }


}
