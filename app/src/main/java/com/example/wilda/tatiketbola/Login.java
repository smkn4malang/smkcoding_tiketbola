package com.example.wilda.tatiketbola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import badoystudio.com.introslider.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void daftar(View view) {
        Intent intent = new Intent(this, Daftar.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
