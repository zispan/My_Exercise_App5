package com.example.my_exercise_app5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtView_name = findViewById(R.id.txtView_name);
        TextView txtView_lastname = findViewById(R.id.txtView_lastname);
        TextView txtView_address = findViewById(R.id.txtView_address);
        TextView txtView_password = findViewById(R.id.txtView_password);
        TextView txtView_email = findViewById(R.id.txtView_email);
        TextView txtView_birthdate = findViewById(R.id.txtView_birthday);

//metafora metavlituis apo main activity
        String name = getIntent().getExtras().getString("name");
        String lastname =getIntent().getExtras().getString("lastname");
        String address =getIntent().getExtras().getString("address");
        String password = getIntent().getExtras().getString("password");
        String email =getIntent().getExtras().getString("email");
        String birthday =getIntent().getExtras().getString("birthday");

        txtView_name.setText(name);
        txtView_lastname.setText(lastname);
        txtView_address.setText(address);
        txtView_password.setText(password);
        txtView_email.setText(email);
        txtView_birthdate.setText(birthday);



    }
}