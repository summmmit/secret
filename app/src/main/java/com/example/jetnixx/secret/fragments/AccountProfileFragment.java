package com.example.jetnixx.secret.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jetnixx.secret.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountProfileFragment extends Fragment {

    TextView email_address, password;

    public AccountProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account_profile, container, false);
        email_address = (TextView) view.findViewById(R.id.email_address);
        password = (TextView) view.findViewById(R.id.password);

        Log.i("email", email_address.getText().toString());

        return view;
    }


}
