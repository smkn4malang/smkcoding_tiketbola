package com.example.wilda.tatiketbola;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

import badoystudio.com.introslider.R;

public class profil extends AppCompatActivity {


    private TextView txtprofil;
    private Button btnlogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        txtprofil = (TextView) findViewById(R.id.txtprofil);
        btnlogout = (Button) findViewById(R.id.btnlogout);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sessionManager.logout();
            }
        });

        sessionManager = new SessionManager(getApplicationContext());
        HashMap<String, String> user = sessionManager.getUserDetails();
        String name = user.get(SessionManager.kunci_email);
        txtprofil.setText(Html.fromHtml("<br>" + name + "<br>"));
    }

    public void rumah(View view) {
        Intent intent = new Intent(this, menuawal.class);
        startActivity(intent);
    }

    public void logout(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    SessionManager sessionManager;


}
