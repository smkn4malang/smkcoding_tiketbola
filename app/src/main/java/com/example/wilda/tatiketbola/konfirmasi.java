package com.example.wilda.tatiketbola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import badoystudio.com.introslider.R;

public class konfirmasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);
    }

    public void kembali(View view) {
        Intent intent = new Intent(this, PilihJadwalArema.class);
        startActivity(intent);
    }
    public void lanjut(View view) {
        Intent intent = new Intent(this, pembayaran.class);
        startActivity(intent);
    }
}
