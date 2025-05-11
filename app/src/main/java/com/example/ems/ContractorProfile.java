package com.example.ems;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class ContractorProfile extends Fragment {

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contractor_profile, container, false);

        String[] introductions = {
                "Akash is a highly skilled event manager with over 10 years of experience in planning and executing corporate events, conferences, and weddings. His expertise lies in seamless coordination and ensuring every event runs smoothly.",

                "Rahul is a creative and detail-oriented event planner who specializes in designing unique and engaging experiences. From intimate gatherings to large-scale festivals, she brings innovation and perfection to every event.",

                "Geeta is a professional contractor known for delivering high-quality event setups, including stages, tents, and booths. With a strong background in logistics and infrastructure, he ensures timely and efficient execution.",

                "Ganesh is a logistics and operations expert who specializes in managing vendor coordination, budget planning, and on-site execution. She is known for her ability to handle complex events with precision and efficiency.",

                "Ayan is a stage and lighting contractor with expertise in transforming venues using advanced sound and lighting setups. His work enhances event ambiance, creating stunning visual and auditory experiences.",

                "Abhishek is a catering and hospitality coordinator who curates exquisite menus and dining experiences for events. She works closely with chefs and catering teams to deliver high-quality food and exceptional service.",

                "Rohit is an experienced event security contractor who ensures the safety and smooth operation of high-profile events. His expertise includes crowd management, risk assessment, and emergency response planning.",

                "Vikas is a venue coordinator who helps clients find the perfect location for their events. She specializes in negotiating contracts, managing venue logistics, and ensuring the space aligns with the event’s theme and requirements.",

                "Tanaya is an audio-visual and technical support contractor with a deep understanding of event production. He provides top-tier sound systems, projectors, and live streaming solutions to enhance audience engagement.",

                "Roohi is a floral and décor specialist who designs elegant and aesthetically pleasing setups for weddings, corporate events, and private parties. Her eye for detail ensures every venue is transformed into a breathtaking space."
        };


        ImageView imageView;
        TextView textView;
        textView = view.findViewById(R.id.textView);
        imageView = view.findViewById(R.id.pic);
        if (getArguments() != null) {
            int c_no = getArguments().getInt("userId"); // Default value = 0

            if(c_no == 1){
                imageView.setImageResource(R.drawable.akash);
                textView.setText(introductions[0]);

            }

            if(c_no == 2){
                imageView.setImageResource(R.drawable.rahul);
                textView.setText(introductions[1]);

            }

            if(c_no == 3){
                imageView.setImageResource(R.drawable.geeta);
                textView.setText(introductions[2]);

            }
            if(c_no == 4){
                imageView.setImageResource(R.drawable.ganesh);
                textView.setText(introductions[3]);

            }
            if(c_no == 5){
                imageView.setImageResource(R.drawable.ayan);
                textView.setText(introductions[4]);

            }
            if(c_no == 6){
                imageView.setImageResource(R.drawable.abhishek);
                textView.setText(introductions[5]);

            }
            if(c_no == 7){
                imageView.setImageResource(R.drawable.rohit);
                textView.setText(introductions[6]);

            }
            if(c_no == 8){
                imageView.setImageResource(R.drawable.vikas);
                textView.setText(introductions[7]);

            }
            if(c_no == 9){
                imageView.setImageResource(R.drawable.tanaya);
                textView.setText(introductions[8]);

            }
            if(c_no == 10){
                imageView.setImageResource(R.drawable.roohi);
                textView.setText(introductions[9]);

            }

        }

        return view;
    }
}