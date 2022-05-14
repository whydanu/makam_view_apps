package com.whydanu.makam_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class profile extends AppCompatActivity {

    //deklarasi
        Button keluar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        keluar = (Button)findViewById(R.id.keluar);

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pindah ke dasboard
                Intent pindah = new Intent(profile.this,Dashboard.class);
                startActivity(pindah);
            }
        });




    }
}