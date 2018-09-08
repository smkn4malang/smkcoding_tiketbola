package com.example.wilda.tatiketbola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import badoystudio.com.introslider.R;

public class Daftar extends AppCompatActivity {

    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
    }

    public void menu(View view) {
        Intent intent = new Intent(this, menuawal.class);
        startActivity(intent);
        finish();
    }

}
