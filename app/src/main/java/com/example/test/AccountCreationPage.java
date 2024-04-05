package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AccountCreationPage extends AppCompatActivity {

    private Button confirm, cancel;
    private EditText user, pass, confPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_creation_page);

        confirm = findViewById(R.id.confirm_creation);
        cancel = findViewById(R.id.cancel_creation);
        user = findViewById(R.id.create_email);
        pass = findViewById(R.id.create_password);
        confPass = findViewById(R.id.confirm_password);


        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountCreationPage.this, SeeCoursesActivity.class);
                startActivity(intent);
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = user.getText().toString();
                String password = pass.getText().toString();
                String confPassword = confPass.getText().toString();
                if (validLogin(username, password, confPassword)) {

                } else {
                    Toast.makeText(AccountCreationPage.this, "Login information invalid",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean validLogin(String u,String p1, String p2) {
        return (p1.equals(p2) && u.length() > 0 && u.contains("@") && u.contains(".com"));
    }
}
