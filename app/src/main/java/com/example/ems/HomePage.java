package com.example.ems;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.ems.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomePage extends AppCompatActivity {
    ActivityMainBinding binding;
    String msg1,msg2;
    String val;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selected_fragement = null;

                int id = item.getItemId();

                if (id==R.id.Home){
                    selected_fragement=new HomeFragment();
                } else if (id == R.id.Venue) {
                    selected_fragement=new VenueFragment();
                }else if (id == R.id.Myevent) {
                    selected_fragement=new MyeventFragment();
                }
                else {
//                    selected_fragement=new ProfileFragment();\


                    ProfileFragment fragmentB = new ProfileFragment();
                    val = getIntent().getStringExtra("img");
                    msg1 =getIntent().getStringExtra("name");
                    msg2 =getIntent().getStringExtra("email");
                    Bundle bundle = new Bundle();
                    bundle.putString("img",val);
                    bundle.putString("name",msg1);
                    bundle.putString("message2",msg2);

                    fragmentB.setArguments(bundle);

                    // 2. Navigate to Fragment B
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragmentB).commit();



                }

                if(selected_fragement != null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,selected_fragement).commit();
                }
                return false;
            }
        });

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new HomeFragment()).commit();

        }
    }
}