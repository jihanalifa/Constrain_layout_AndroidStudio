package com.example.jihan;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {

    private EditText namaEditText, noTelponEditText, emailEditText;
    private Button loginButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        namaEditText = findViewById(R.id.NAMA);
        noTelponEditText = findViewById(R.id.NO_TELPON);
        emailEditText = findViewById(R.id.EMAIL);
        loginButton = findViewById(R.id.LOGIN);
        registerButton = findViewById(R.id.REGISTER);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = namaEditText.getText().toString();
                String noTelpon = noTelponEditText.getText().toString();
                String email = emailEditText.getText().toString();

                // Tambahkan logika validasi dan login di sini
                if (nama.equals("Jihan") && email.contains("@")){
                    Toast.makeText(MainActivity2.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity2.this, MainActivity4.class));
                    finish();
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
                    builder.setMessage("login Gagal")
                            .setNegativeButton("Retry", null)
                            .create()
                            .show();
                }
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
                finish();
            }
        });
    }
}