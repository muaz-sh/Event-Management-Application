package com.example.ems;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class Contractor extends Fragment {
    CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10;
    int key=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contractor, container, false);
        cardView1=view.findViewById(R.id.akashc);
        cardView2 = view.findViewById(R.id.rahulc);
        cardView3 = view.findViewById(R.id.geetac);
        cardView4 = view.findViewById(R.id.ganeshc);
        cardView5=view.findViewById(R.id.ayanc);
        cardView6 = view.findViewById(R.id.abhic);
        cardView7 = view.findViewById(R.id.rohitc);
        cardView8 = view.findViewById(R.id.vikasc);
        cardView9 = view.findViewById(R.id.tanayac);
        cardView10 = view.findViewById(R.id.roohic);

        cardView1.setOnClickListener(v ->  {
            key = 1;
            Bundle bundle = new Bundle();
            bundle.putInt("userId", key);

            ContractorProfile fragmentB = new ContractorProfile();
            fragmentB.setArguments(bundle);

            FragmentTransaction fm = requireActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.contractor, fragmentB);
            fm.addToBackStack(null);  // Optional: Allow going back
            fm.commit();

        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = 2;
                Bundle bundle = new Bundle();
                bundle.putInt("userId", key);

                ContractorProfile fragmentB = new ContractorProfile();
                fragmentB.setArguments(bundle);

                FragmentTransaction fm = requireActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.contractor, fragmentB);
                fm.addToBackStack(null);  // Optional: Allow going back
                fm.commit();

            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = 3;
                Bundle bundle = new Bundle();
                bundle.putInt("userId", key);

                ContractorProfile fragmentB = new ContractorProfile();
                fragmentB.setArguments(bundle);

                FragmentTransaction fm = requireActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.contractor, fragmentB);
                fm.addToBackStack(null);  // Optional: Allow going back
                fm.commit();
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = 4;

                Bundle bundle = new Bundle();
                bundle.putInt("userId", key);

                ContractorProfile fragmentB = new ContractorProfile();
                fragmentB.setArguments(bundle);

                FragmentTransaction fm = requireActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.contractor, fragmentB);
                fm.addToBackStack(null);  // Optional: Allow going back
                fm.commit();
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = 5;

                Bundle bundle = new Bundle();
                bundle.putInt("userId", key);

                ContractorProfile fragmentB = new ContractorProfile();
                fragmentB.setArguments(bundle);

                FragmentTransaction fm = requireActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.contractor, fragmentB);
                fm.addToBackStack(null);  // Optional: Allow going back
                fm.commit();
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = 6;
                Bundle bundle = new Bundle();
                bundle.putInt("userId", key);

                ContractorProfile fragmentB = new ContractorProfile();
                fragmentB.setArguments(bundle);

                FragmentTransaction fm = requireActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.contractor, fragmentB);
                fm.addToBackStack(null);  // Optional: Allow going back
                fm.commit();
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = 7;
                Bundle bundle = new Bundle();
                bundle.putInt("userId", key);

                ContractorProfile fragmentB = new ContractorProfile();
                fragmentB.setArguments(bundle);

                FragmentTransaction fm = requireActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.contractor, fragmentB);
                fm.addToBackStack(null);  // Optional: Allow going back
                fm.commit();
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = 8;
                Bundle bundle = new Bundle();
                bundle.putInt("userId", key);

                ContractorProfile fragmentB = new ContractorProfile();
                fragmentB.setArguments(bundle);

                FragmentTransaction fm = requireActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.contractor, fragmentB);
                fm.addToBackStack(null);  // Optional: Allow going back
                fm.commit();
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = 9;
                Bundle bundle = new Bundle();
                bundle.putInt("userId", key);

                ContractorProfile fragmentB = new ContractorProfile();
                fragmentB.setArguments(bundle);

                FragmentTransaction fm = requireActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.contractor, fragmentB);
                fm.addToBackStack(null);  // Optional: Allow going back
                fm.commit();
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = 10;
                Bundle bundle = new Bundle();
                bundle.putInt("userId", key);

                ContractorProfile fragmentB = new ContractorProfile();
                fragmentB.setArguments(bundle);

                FragmentTransaction fm = requireActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.contractor, fragmentB);
                fm.addToBackStack(null);  // Optional: Allow going back
                fm.commit();
            }
        });


        return view;    }
}