package com.example.wilda.tatiketbola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import badoystudio.com.introslider.R;

public class MainMenu extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutama);
    }

    public void profile(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void pesan(View view) {
        Intent intent = new Intent(this, PilihTim.class);
        startActivity(intent);
    }
}
