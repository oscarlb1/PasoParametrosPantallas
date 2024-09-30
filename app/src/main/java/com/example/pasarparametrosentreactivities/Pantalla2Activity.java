package com.example.pasarparametrosentreactivities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Pantalla2Activity extends AppCompatActivity {

    private TextView txtUser;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
            txtUser = (TextView)findViewById(R.id.txtUserPantalla2);
            Bundle variables = getIntent().getExtras();
            String user = variables.getString("Usuario");
            txtUser.setText(user);

    }
}