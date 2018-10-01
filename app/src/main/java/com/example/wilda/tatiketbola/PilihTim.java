package com.example.wilda.tatiketbola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import badoystudio.com.introslider.R;

public class PilihTim extends AppCompatActivity {
    Spinner spinner;
    private RecyclerView recyclerView;
    private int[] images = {R.drawable.arema, R.drawable.bali, R.drawable.barito, R.drawable.bhayangkara,
            R.drawable.borneo, R.drawable.madura, R.drawable.mitrakukar, R.drawable.persebaya, R.drawable.persela,
            R.drawable.perseru, R.drawable.persib, R.drawable.persija, R.drawable.persipura, R.drawable.psis, R.drawable.psm,
            R.drawable.psms, R.drawable.pstni,R.drawable.sriwijaya};
    private RecyclerAdapter adapter;

    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_tim);
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(images);
        recyclerView.setAdapter(adapter);
    }

    public void cari(View view) {
        Intent intent = new Intent(this, PilihJadwalArema.class);
        startActivity(intent);
    }
}
