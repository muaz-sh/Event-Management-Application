package com.example.ems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.ems.R;

public class LoginPage extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        textView = findViewById(R.id.signupText);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginPage.this,RegistrationActivity.class);
                startActivity(intent);
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Muazzam") && password.getText().toString().equals("1234")) {
                    Intent intent = new Intent(LoginPage.this,HomePage.class);
                    intent.putExtra("img","m");
                    intent.putExtra("name","Muazzam Shabai");
                    intent.putExtra("email","muazzam.shabai@gmail.com");
                    startActivity(intent);
                }
                else if (username.getText().toString().equals("Sanket") && password.getText().toString().equals("1234")) {
                    Intent intent = new Intent(LoginPage.this,HomePage.class);
                    intent.putExtra("img","s");
                    intent.putExtra("name","Sanket Zombade");
                    intent.putExtra("email","sanket.zombade12@gmail.com");
                    startActivity(intent);
                }
                else if (username.getText().toString().equals("Harshad") && password.getText().toString().equals("1234")) {
                    Intent intent = new Intent(LoginPage.this,HomePage.class);
                    intent.putExtra("img","h");
                    intent.putExtra("name","Harshad Tambe");
                    intent.putExtra("email","tambeharshad12@gmail.com");
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginPage.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}