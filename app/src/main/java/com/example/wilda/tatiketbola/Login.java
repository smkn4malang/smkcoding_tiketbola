package com.example.wilda.tatiketbola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import badoystudio.com.introslider.R;

public class Login extends AppCompatActivity {

    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sessionManager = new SessionManager(getApplicationContext());
    }

    Login(){
        sessionManager.createSession(logtxtEmail.getText().toString());
    }

    public void daftar(View view) {
        Intent intent = new Intent(this, Daftar.class);
        startActivity(intent);
        finish();
    }

    public void login(View view) {
        Intent intent = new Intent(this, menuawal.class);
        startActivity(intent);
        finish();
    }
}
