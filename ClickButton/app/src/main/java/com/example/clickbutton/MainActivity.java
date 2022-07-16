package com.example.clickbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText e1,e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView);
        e1 = findViewById(R.id.a);
        e2 = findViewById(R.id.editTextNumberSigned);
        b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int var1 = Integer.valueOf(e1.getText().toString());
                int var2 = Integer.valueOf(e2.getText().toString());

                int var3 = var1+var2;
                t1.setText(String.valueOf(var3));
            }
        });

    }

}