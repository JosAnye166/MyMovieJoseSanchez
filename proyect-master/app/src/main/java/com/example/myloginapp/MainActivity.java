package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.Entrar);

        //usuario y contra admin admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("Jose161610") && password.getText().toString().equals("123424")){
                    //correct
                    Toast.makeText(MainActivity.this,"Sesion iniciada!",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"Error en los datos",Toast.LENGTH_SHORT).show();
            }

        });





    } }
