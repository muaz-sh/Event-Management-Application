package com.example.ems;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Explore extends Fragment {

    CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10,cardView11;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore, container, false);

        cardView1=view.findViewById(R.id.c1);
        cardView2 = view.findViewById(R.id.c2);
        cardView3 = view.findViewById(R.id.c3);
        cardView4 = view.findViewById(R.id.c4);
        cardView5=view.findViewById(R.id.c5);
        cardView6 = view.findViewById(R.id.c6);
        cardView7 = view.findViewById(R.id.c7);
        cardView8 = view.findViewById(R.id.c8);
        cardView9 = view.findViewById(R.id.c9);
        cardView10 = view.findViewById(R.id.c10);
        cardView11 = view.findViewById(R.id.c11);

        cardView1.setOnClickListener(v -> {
            VenueFragment fragmentB = new VenueFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.exploref, fragmentB); // Replace with new fragment
            fragmentTransaction.addToBackStack(null); // Add to back stack for back navigation
            fragmentTransaction.commit(); // Commit the transaction

        });
        cardView2.setOnClickListener(v -> {
            VenueFragment fragmentB = new VenueFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.exploref, fragmentB); // Replace with new fragment
            fragmentTransaction.addToBackStack(null); // Add to back stack for back navigation
            fragmentTransaction.commit(); // Commit the transaction

        });

        cardView3.setOnClickListener(v -> {
            VenueFragment fragmentB = new VenueFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.exploref, fragmentB); // Replace with new fragment
            fragmentTransaction.addToBackStack(null); // Add to back stack for back navigation
            fragmentTransaction.commit(); // Commit the transaction

        });

        cardView4.setOnClickListener(v -> {
            VenueFragment fragmentB = new VenueFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.exploref, fragmentB); // Replace with new fragment
            fragmentTransaction.addToBackStack(null); // Add to back stack for back navigation
            fragmentTransaction.commit(); // Commit the transaction

        });

        cardView5.setOnClickListener(v -> {
            VenueFragment fragmentB = new VenueFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.exploref, fragmentB); // Replace with new fragment
            fragmentTransaction.addToBackStack(null); // Add to back stack for back navigation
            fragmentTransaction.commit(); // Commit the transaction

        });

        cardView6.setOnClickListener(v -> {
            VenueFragment fragmentB = new VenueFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.exploref, fragmentB); // Replace with new fragment
            fragmentTransaction.addToBackStack(null); // Add to back stack for back navigation
            fragmentTransaction.commit(); // Commit the transaction

        });

        cardView7.setOnClickListener(v -> {
            VenueFragment fragmentB = new VenueFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.exploref, fragmentB); // Replace with new fragment
            fragmentTransaction.addToBackStack(null); // Add to back stack for back navigation
            fragmentTransaction.commit(); // Commit the transaction

        });

        cardView8.setOnClickListener(v -> {
            VenueFragment fragmentB = new VenueFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.exploref, fragmentB); // Replace with new fragment
            fragmentTransaction.addToBackStack(null); // Add to back stack for back navigation
            fragmentTransaction.commit(); // Commit the transaction

        });
        cardView9.setOnClickListener(v -> {
            VenueFragment fragmentB = new VenueFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.exploref, fragmentB); // Replace with new fragment
            fragmentTransaction.addToBackStack(null); // Add to back stack for back navigation
            fragmentTransaction.commit(); // Commit the transaction

        });

        cardView10.setOnClickListener(v -> {
            VenueFragment fragmentB = new VenueFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.exploref, fragmentB); // Replace with new fragment
            fragmentTransaction.addToBackStack(null); // Add to back stack for back navigation
            fragmentTransaction.commit(); // Commit the transaction

        });

        cardView11.setOnClickListener(v -> {
            VenueFragment fragmentB = new VenueFragment();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.exploref, fragmentB); // Replace with new fragment
            fragmentTransaction.addToBackStack(null); // Add to back stack for back navigation
            fragmentTransaction.commit(); // Commit the transaction

        });



        return view;
    }
}