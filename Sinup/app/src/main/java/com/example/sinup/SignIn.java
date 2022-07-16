package com.example.sinup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        EditText email = findViewById(R.id.email1);
        EditText pass = findViewById(R.id.password1);
        Intent setMail = getIntent();
        String emailR = getIntent().getStringExtra("email");
        String passwordR = getIntent().getStringExtra("password");
        email.setText(emailR);
        pass.setText(passwordR);
        Button signin = findViewById(R.id.signIn);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignIn.this,LoginSuccess.class);
                String se = email.getText().toString();
                String sp = pass.getText().toString();
                if(emailR.equals(se) && passwordR.equals(sp)){
                    startActivity(i);
                }else{
                    Toast.makeText(SignIn.this,"Invalid Credintial",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}