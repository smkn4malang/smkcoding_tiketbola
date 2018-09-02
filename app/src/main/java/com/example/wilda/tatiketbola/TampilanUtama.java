package com.example.wilda.tatiketbola;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import badoystudio.com.introslider.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TampilanUtama extends AppCompatActivity {

    @BindView(R.id.frame_container)
    FrameLayout frameContainer;
    @BindView(R.id.navigation_home)
    Button navigationHome;
    @BindView(R.id.navigation_pesanan)
    Button navigationPesanan;
    @BindView(R.id.navigation_profil)
    Button navigationProfil;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_pesanan:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_profil:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_utama);
        ButterKnife.bind(this);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.add(R.id.frame_container.new FirstFragment());
        fragmentTransaction.add(R.id.frame_container.new SecondFragment());
        fragmentTransaction.add(R.id.frame_container.new ThirdFragment());
        fragmentTransaction.commit();

        @OnClick(R.id.navigation_home)
                public void onBtnFragment1Clicked(){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.frame_container,new FirstFragment());
            fragmentTransaction.commit();
        }

        @OnClick(R.id.navigation_pesanan)
        public void onBtnFragment2Clicked(){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.frame_container,new SecondFragment());
            fragmentTransaction.commit();
        }

        @OnClick(R.id.navigation_profil)
        public void onBtnFragment3Clicked(){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.frame_container,new ThirdFragment());
            fragmentTransaction.commit();
        }


        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
