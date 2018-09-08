package com.example.wilda.tatiketbola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import badoystudio.com.introslider.R;

public class PilihTim extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_tim);
        spinner = (Spinner)findViewById(R.id.idSpinner);
        String[]pilihtiket ={"VVIP","VIP","Ekonomi."};
        ArrayAdapter<String>adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,pilihtiket);
        spinner.setAdapter(adapter);

        spinner = (Spinner)findViewById(R.id.spinner);
        String[]jumlahtiket ={"1","2","3","4","5","6","7","8","9","10"};
        ArrayAdapter<String>adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,jumlahtiket);
        spinner.setAdapter(adapter1);
    }

    public void cari(View view) {
        Intent intent = new Intent(this, PilihJadwalArema.class);
        startActivity(intent);
    }
}
