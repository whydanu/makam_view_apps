package com.whydanu.makam_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class Dashboard extends AppCompatActivity {
    //deklarasi
    MaterialCardView card_profil;
    MaterialCardView card_datamakam;
    MaterialCardView card_uang;
    MaterialCardView card_logout;
    MaterialCardView carrd_abaout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //isi dengan element
        card_profil = (MaterialCardView) findViewById(R.id.card_profil);
        card_datamakam = (MaterialCardView) findViewById(R.id.card_datamakam);
        card_uang = (MaterialCardView) findViewById(R.id.card_uang);
        card_logout = (MaterialCardView) findViewById(R.id.card_logout);
        carrd_abaout = (MaterialCardView) findViewById(R.id.card_abaout);

        //card profil tekan
        card_profil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //pindah
                Intent pindah = new Intent(Dashboard.this, profile.class);
                startActivity(pindah);
            }
        });
        //card datamakam
        card_datamakam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent ( Dashboard.this,data_makam.class);
                startActivity(pindah);
            }
        });

        //card uang
        card_uang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent( Dashboard.this,transaksi.class);
                startActivity(pindah);
            }
        });
        //card_logout
        card_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent( Dashboard.this,login.class);
                startActivity(pindah);
            }
        });
        carrd_abaout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Dashboard.this, about.class);
                startActivity(pindah);
            }
            });
    }
}
