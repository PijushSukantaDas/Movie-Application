package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    Button register;
    EditText username,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        register = findViewById(R.id.registration_button_id);
        username = findViewById(R.id.registration_usename_ID);
        password = findViewById(R.id.registration_password_ID);
        email = findViewById(R.id.registration_mail_ID);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name,pass,mail;
                name = username.getText().toString();
                pass = password.getText().toString();
                mail = email.getText().toString();
                if((!name.equals(null))&&(!pass.equals(null))&&(!email.equals(null))) {
                    Toast.makeText(getApplicationContext(),mail,Toast.LENGTH_LONG).show();
                    Intent loginPage = new Intent(getApplicationContext(), LoginActivity.class);
                    //startActivity(loginPage);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Empty Field",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
