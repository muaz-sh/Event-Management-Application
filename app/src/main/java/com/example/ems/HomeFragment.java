package com.example.ems;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {
    Button button1,button2,button3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        button1 = view.findViewById(R.id.explore);
        button2 = view.findViewById(R.id.Venue);
        button3 = view.findViewById(R.id.Contractor);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fm =getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.home_nav,new Explore()).commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fm =getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.home_nav,new VenueFragment()).commit();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fm =getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.home_nav,new Contractor()).commit();
            }
        });


        return view;
    }
}