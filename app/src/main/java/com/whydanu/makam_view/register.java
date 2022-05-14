package com.whydanu.makam_view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class register extends AppCompatActivity {
    db_helper db;
    Button login, register;
    EditText username, password, passwordConf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



            db = new db_helper(this);

            username = (EditText)findViewById(R.id.edtText_usernameRegist);
            password = (EditText)findViewById(R.id.edtText_passwordRegist);
            passwordConf = (EditText)findViewById(R.id.edtText_passwordConfRegist);
            login = (Button)findViewById(R.id.btn_loginRegist);
            register = (Button)findViewById(R.id.btn_registerRegist);

            //login
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent loginIntent = new Intent(register.this, login.class);
                    startActivity(loginIntent);
                    finish();
                }
            });

            //register
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String strUsername = username.getText().toString();
                    String strPassword = password.getText().toString();
                    String strPasswordConf = passwordConf.getText().toString();
                    if (strPassword.equals(strPasswordConf)) {
                        Boolean daftar = db.insertUser(strUsername, strPassword);
                        if (daftar == true) {
                            Toast.makeText(getApplicationContext(), "Daftar Berhasil", Toast.LENGTH_SHORT).show();
                            Intent loginIntent = new Intent(register.this, login.class);
                            startActivity(loginIntent);
                            finish();
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Daftar Gagal", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Password Tidak Cocok", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

