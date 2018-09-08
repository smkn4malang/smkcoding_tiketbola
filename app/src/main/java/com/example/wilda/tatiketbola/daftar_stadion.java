package com.example.wilda.tatiketbola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import badoystudio.com.introslider.R;

public class daftar_stadion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_stadion);
    }

    public void pilihan(View view) {
        Intent intent = new Intent(this, deskripsi.class);
        startActivity(intent);
    }
    public void home(View view) {
        Intent intent = new Intent(this, menuawal.class);
        startActivity(intent);
    }
}
