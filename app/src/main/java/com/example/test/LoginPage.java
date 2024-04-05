package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {

    private Button loginButton;
    private TextView dontHave;
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_management_page);

        loginButton = findViewById(R.id.button_prim);
        dontHave = findViewById(R.id.don_t_have_);
        username = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);


        dontHave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginPage.this, AccountCreationPage.class);
                startActivity(intent);
            }
        });

    }
}
