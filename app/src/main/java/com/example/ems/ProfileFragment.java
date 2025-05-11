package com.example.ems;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ProfileFragment extends Fragment {
    TextView name,email;
    ImageView img;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_profile, container, false);
        name = v.findViewById(R.id.pname);
        email = v.findViewById(R.id.AfterLoginEmailIDTExtview);
        img = v.findViewById(R.id.profile_icon);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String msg1 = bundle.getString("name");
            String msg2 = bundle.getString("message2");
            String val = bundle.getString("img");

            if(val.equals("m")){
                img.setImageResource(R.drawable.muazzam);
            } else if (val.equals("s")) {
                img.setImageResource(R.drawable.sanket);
            }else if(val.equals("h")){
                   img.setImageResource(R.drawable.harshad);
            }
            name.setText(msg1);
            email.setText(msg2);
        }
        return v;
    }
}