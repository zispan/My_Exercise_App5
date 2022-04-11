package com.example.my_exercise_app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edTxt_name = findViewById(R.id.edTxt_name);
        EditText edTxt_lastname = findViewById(R.id.edTxt_lastname);
        EditText edTxt_address = findViewById(R.id.edTxt_address);
        EditText edTxt_password = findViewById(R.id.edTxt_password);
        EditText edTxt_email = findViewById(R.id.edTxt_email);
        EditText edTxt_birthday = findViewById(R.id.edTxt_date);
        Button btn_save = findViewById(R.id.btn_save);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 // allagi activity me xrisi klasis intent
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);

                String name= edTxt_name.getText().toString();
                String lastname= edTxt_lastname.getText().toString();
                String address= edTxt_address.getText().toString();
                String password= edTxt_password.getText().toString();
                String email= edTxt_email.getText().toString();
                String birthday= edTxt_birthday.getText().toString();
//metafora metavlitis se alli activity
                intent.putExtra("name",name);
                intent.putExtra("lastname",lastname);
                intent.putExtra("address",address);
                intent.putExtra("password",password);
                intent.putExtra("email",email);
                intent.putExtra("birthday",birthday);

                startActivity(intent);
            }
        });


    }
}