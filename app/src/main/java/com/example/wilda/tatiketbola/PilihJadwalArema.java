package com.example.wilda.tatiketbola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import badoystudio.com.introslider.R;

public class PilihJadwalArema extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_jadwal_arema);
    }

    public void mbalik(View view) {
        Intent intent = new Intent(this, menuawal.class);
        startActivity(intent);
        finish();
    }

    public void pilih(View view) {
        Intent intent = new Intent(this, konfirmasi.class);
        startActivity(intent);
    }
}
