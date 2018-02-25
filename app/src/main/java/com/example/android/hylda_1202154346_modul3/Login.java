package com.example.android.hylda_1202154346_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText user;
    private EditText pass;
    String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view) {
        // Memasukan isi dari field username pada activity login
        user = (EditText) findViewById(R.id.fieldusername);
        // Mengambil isi dari field password pada activity Login
        pass = (EditText) findViewById(R.id.fieldpassword);
        username = user.getText().toString();
        password = pass.getText().toString();


        if ((username.contains("EAD"))&&((password.contains("MOBILE")))) {
            Toast.makeText(this, "Berhasil Login", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Login.this,menu.class);
            startActivity(intent);
        } else if ((username.matches("")||password.matches(""))) {
            Toast.makeText(this, "Isi Username dan Password", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Username/Password salah", Toast.LENGTH_SHORT).show();
        }
    }

}
