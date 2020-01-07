package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);
        login = findViewById(R.id.login_button_id);
        username = findViewById(R.id.login_usename_ID);
        password = findViewById(R.id.login_password_ID);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String pass = password.getText().toString();
                if((name != null)&&(pass!=null)) {
                    Intent loginPage = new Intent(getApplicationContext(), ProductActivity.class);
                    startActivity(loginPage);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Empty Field",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
