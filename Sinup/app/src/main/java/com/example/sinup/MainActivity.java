package com.example.sinup;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.SplittableRandom;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bsignUp = findViewById(R.id.signup);
        EditText email = findViewById(R.id.email);
        EditText pass = findViewById(R.id.password);

        bsignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = pass.getText().toString();
                if (!isValidPassword(s))
                {
                    Toast.makeText(MainActivity.this, "Password doesn't match rules", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent i = new Intent(MainActivity.this, SignIn.class);
                i.putExtra("email", email.getText().toString());
                i.putExtra("password", pass.getText().toString());
                startActivity(i);
            }
        });

    }

    Pattern lowerCase = Pattern.compile("^.*[a-z].*$");
    Pattern upperCase = Pattern.compile("^.*[A-Z].*$");
    Pattern number = Pattern.compile("^.*[0-9].*$");
    Pattern specialCharacter = Pattern.compile("^.*[^a-zA-Z0-9].*$");

    boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        if (!lowerCase.matcher(password).matches()) return false;
        if (!upperCase.matcher(password).matches()) return false;
        if (!number.matcher(password).matches()) return false;
        if (!specialCharacter.matcher(password).matches()) return false;
        return true;
    }


}