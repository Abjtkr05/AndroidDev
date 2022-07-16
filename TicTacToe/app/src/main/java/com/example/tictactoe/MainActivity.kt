package com.example.tictactoe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var flag = 0;
    var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun clear(){
        btn1.text = "".toString()
        btn2.text = "".toString()
        btn3.text = "".toString()
        btn4.text = "".toString()
        btn5.text = "".toString()
        btn6.text = "".toString()
        btn7.text = "".toString()
        btn8.text = "".toString()
        btn9.text = "".toString()
        flag = 0
        count = 0;
    }

    fun check(view: View) {
        var btn: Button = view as Button;
        if (btn.text.toString() == "") {
            if (flag == 0) {
                btn.text = 'X'.toString()
                flag = 1
                count++
            } else {
                btn.text = 'O'.toString()
                flag = 0
                count++
            }
            if (count > 4) {
                var b1 = btn1.text
                var b2 = btn2.text
                var b3 = btn3.text
                var b4 = btn4.text
                var b5 = btn5.text
                var b6 = btn6.text
                var b7 = btn7.text
                var b8 = btn8.text
                var b9 = btn9.text

                if (b1.equals(b2) && b2.equals(b3) && (!b1.equals(""))) {
                    Toast.makeText(this, "Winner is $b1", Toast.LENGTH_LONG).show()
                    clear()
                } else if (b4.equals(b5) && b5.equals(b6) && (!b4.equals(""))) {
                    Toast.makeText(this, "Winner is $b4", Toast.LENGTH_LONG).show()
                    clear()
                } else if (b7.equals(b8) && b8.equals(b9) && (!b7.equals(""))) {
                    Toast.makeText(this, "Winner is $b7", Toast.LENGTH_LONG).show()
                    clear()
                } else if (b1.equals(b4) && b4.equals(b7) && (!b4.equals(""))) {
                    Toast.makeText(this, "Winner is $b1", Toast.LENGTH_LONG).show()
                    clear()
                } else if (b2.equals(b5) && b5.equals(b8) && (!b2.equals(""))) {
                    Toast.makeText(this, "Winner is $b2", Toast.LENGTH_LONG).show()
                    clear()
                } else if (b3.equals(b6) && b6.equals(b9) && (!b3.equals(""))) {
                    Toast.makeText(this, "Winner is $b3", Toast.LENGTH_LONG).show()
                    clear()
                } else if (b1.equals(b5) && b5.equals(b9) && (!b1.equals(""))) {
                    Toast.makeText(this, "Winner is $b1", Toast.LENGTH_LONG).show()
                    clear()
                } else if (b3.equals(b5) && b5.equals(b7) && (!b3.equals(""))) {
                    Toast.makeText(this, "Winner is $b3", Toast.LENGTH_LONG).show()
                    clear()
                }else if(count == 9){
                    Toast.makeText(this, "Match is Draw", Toast.LENGTH_LONG).show()
                    clear()
                }

            }
        }
    }
}