package ute.example.baohng.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ute.example.baohng.R;

public class Login extends AppCompatActivity {

    EditText username, password;
    Button btnLogin, btnCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.inputEmail);
        password = findViewById(R.id.inputPassword);

        btnLogin = findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().trim().equals("bao.hng221b@gmail.com") &&
                        password.getText().toString().trim().equals("eugen")) {
                    startActivity(new Intent(Login.this,Profile.class));
                    Toast.makeText(Login.this, "Success", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Login.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCreateAccount = findViewById(R.id.buttonCreateAccount);
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,SignUp.class));
            }
        });
    }
}