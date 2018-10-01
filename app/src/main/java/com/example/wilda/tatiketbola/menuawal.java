package com.example.wilda.tatiketbola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import badoystudio.com.introslider.R;

public class menuawal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuawal);
    }
    public void orang(View view) {
        Intent intent = new Intent(this, profil.class);
        startActivity(intent);
    }

    public void pesan(View view) {
        Intent intent = new Intent(this, PilihTim.class);
        startActivity(intent);
    }

    public void hasil(View view) {
        Intent intent = new Intent(this, hasil.class);
        startActivity(intent);
    }

    public void stadion(View view) {
        Intent intent = new Intent(this, daftar_stadion.class);
        startActivity(intent);
    }

    public void mesan(View view) {
        Intent intent = new Intent(this, pesan.class);
        startActivity(intent);
    }

    public void jadwal(View view) {
        Intent intent = new Intent(this, jadwal.class);
        startActivity(intent);
    }
}
