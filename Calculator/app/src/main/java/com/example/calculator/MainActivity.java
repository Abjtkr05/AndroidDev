package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Optional;

public class MainActivity extends AppCompatActivity {
    private TextView tvi, tva;
    String secondInput = "";

    private boolean m = false;
    private boolean a = false;
    private boolean d = false;
    private boolean s = false;
    private boolean fo = false;
    private boolean si = false;
    private boolean md = false;
    double val1, val2, val3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.one);
        Button b2 = findViewById(R.id.two);
        Button b3 = findViewById(R.id.three);
        Button b4 = findViewById(R.id.four);
        Button b5 = findViewById(R.id.five);
        Button b6 = findViewById(R.id.six);
        Button b7 = findViewById(R.id.seven);
        Button b8 = findViewById(R.id.eight);
        Button b9 = findViewById(R.id.nine);
        Button b0 = findViewById(R.id.zero);
        Button ba = findViewById(R.id.add);
        Button bm = findViewById(R.id.mul);
        Button bs = findViewById(R.id.sub);
        Button bd = findViewById(R.id.div);
        Button be = findViewById(R.id.ans);
        tvi = findViewById(R.id.input);
        tva = findViewById(R.id.res);
        Button bdot = findViewById(R.id.dot);
        Button bmod = findViewById(R.id.mod);
        Button bdel = findViewById(R.id.del);
        Button bac = findViewById(R.id.AC);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck();
                if (si) secondInput += "1";
                tvi.setText(tvi.getText().toString() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck();
                if (si) secondInput += "2";
                tvi.setText(tvi.getText().toString() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck();
                if (si) secondInput += "3";
                tvi.setText(tvi.getText().toString() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck();
                if (si) secondInput += "4";
                tvi.setText(tvi.getText().toString() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck();
                if (si) secondInput += "5";
                tvi.setText(tvi.getText().toString() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck();
                if (si) secondInput += "6";
                tvi.setText(tvi.getText().toString() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck();
                if (si) secondInput += "7";
                tvi.setText(tvi.getText().toString() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck();
                if (si) secondInput += "8";
                tvi.setText(tvi.getText().toString() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck();
                if (si) secondInput += "9";
                tvi.setText(tvi.getText().toString() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck();
                if (si) secondInput += "0";
                tvi.setText(tvi.getText().toString() + "0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck();
                if (si) secondInput += ".";
                tvi.setText(tvi.getText().toString() + ".");
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(tvi.getText().toString());
                tvi.setText(tvi.getText().toString() + "\u002B");
                a = true;
                si = true;
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(tvi.getText().toString());
                s = true;
                si = true;
                tvi.setText(tvi.getText().toString() + "\u2212");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(tvi.getText().toString());
                d = true;
                si = true;
                tvi.setText(tvi.getText().toString() + "\u00F7");

            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(tvi.getText().toString());
                m = true;
                si = true;
                tvi.setText(tvi.getText().toString() + "\u00D7");

            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(tvi.getText().toString());
                tvi.setText(tvi.getText().toString() + "%");
                md = true;
                si = true;
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "";
                tvi.setText(str);
                tva.setText(str);
                val2 = 0;
                val1 = 0;
                si = false;
                secondInput = "";
            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = tvi.getText().toString();
                string = removeLastCharacter(string);
                tvi.setText(string);
                if (si) {
                    secondInput = removeLastCharacter(secondInput);
                }
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fo = false;
                val2 = Double.parseDouble(secondInput);
                if (a) {
                    val3 = val1 + val2;
                    tva.setText(String.valueOf(val3));
                }
                if (d) {
                    val3 = val1 / val2;
                    tva.setText(String.valueOf(val3));
                }
                if (m) {
                    val3 = val1 * val2;
                    tva.setText(String.valueOf(val3));
                }
                if (s) {
                    val3 = val1 - val2;
                    tva.setText(String.valueOf(val3));
                }
                if (md) {
                    val3 = val1 % val2;
                    tva.setText(String.valueOf(val3));
                }

            }
        });


    }


    void firstCheck() {
        if (!fo) {
            fo = true;
            String str = "";
            tvi.setText(str);
            tva.setText(str);
            val2 = 0;
            val1 = 0;
            si = false;
            m = false;
            a = false;
            d = false;
            s = false;
            md = false;
            secondInput = "";
            tvi.setGravity(Gravity.RIGHT);
        }
    }

    public static String removeLastCharacter(String str) {
        String result = Optional.ofNullable(str)
                .filter(sStr -> sStr.length() != 0)
                .map(sStr -> sStr.substring(0, sStr.length() - 1))
                .orElse(str);
        return result;
    }
}
