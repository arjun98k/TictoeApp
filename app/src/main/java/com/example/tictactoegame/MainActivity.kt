package com.example.tictactoegame

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var flags = 0 // Declare flag at the class level
    var count = 0 // Declare count at the class level
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


//        fun init() {
//            val bt1: Button = findViewById(R.id.bt1)
//            val bt2: Button = findViewById(R.id.bt2)
//            val bt3: Button = findViewById(R.id.bt3)
//            val bt4: Button = findViewById(R.id.bt4)
//            val bt5: Button = findViewById(R.id.bt5)
//            val bt6: Button = findViewById(R.id.bt6)
//            val bt7: Button = findViewById(R.id.bt7)
//            val bt8: Button = findViewById(R.id.bt8)
//            val bt9: Button = findViewById(R.id.bt9)
//
//        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets



        }

    }



    public fun check(view: View) {


            val bt1: Button = findViewById(R.id.bt1)
            val bt2: Button = findViewById(R.id.bt2)
            val bt3: Button = findViewById(R.id.bt3)
            val bt4: Button = findViewById(R.id.bt4)
            val bt5: Button = findViewById(R.id.bt5)
            val bt6: Button = findViewById(R.id.bt6)
            val bt7: Button = findViewById(R.id.bt7)
            val bt8: Button = findViewById(R.id.bt8)
            val bt9: Button = findViewById(R.id.bt9)





        val btncurrent = view as Button
        if (btncurrent.getText().toString().equals("")){


        count++
        if (flags == 0){
            btncurrent.setText("X")
            flags = 1

        }else{
            btncurrent.setText("O")
            flags = 0
        }

        if (count > 4){
            var b1 =bt1.getText().toString()
            var b2 =bt2.getText().toString()
            var b3 =bt3.getText().toString()
            var b4 =bt4.getText().toString()
            var b5 =bt5.getText().toString()
            var b6 =bt6.getText().toString()
            var b7 =bt7.getText().toString()
            var b8 =bt8.getText().toString()
            var b9 =bt9.getText().toString()

            fun restart() {
                bt1.setText("")
                bt2.setText("")
                bt3.setText("")
                bt4.setText("")
                bt5.setText("")
                bt6.setText("")
                bt7.setText("")
                bt8.setText("")
                bt9.setText("")

                count = 0
                flags = 0
            }

            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")){

                //1
                Toast.makeText( this,"Winner", Toast.LENGTH_SHORT).show()
                restart()


            } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
                //2

                Toast.makeText( this,"Winner", Toast.LENGTH_SHORT).show()
                restart()

            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
                //3
                Toast.makeText( this,"Winner", Toast.LENGTH_SHORT).show()
                restart()

            } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                //4
                Toast.makeText( this,"Winner", Toast.LENGTH_SHORT).show()
                restart()

            } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")){
                //5
                Toast.makeText( this,"Winner", Toast.LENGTH_SHORT).show()
                restart()

            } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
                //6
                Toast.makeText( this,"Winner", Toast.LENGTH_SHORT).show()
                restart()

            } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")){
                //7
                Toast.makeText( this,"Winner", Toast.LENGTH_SHORT).show()
                restart()

            } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")){
                //8
                Toast.makeText( this,"Winner", Toast.LENGTH_SHORT).show()
                restart()

            }

        }
            }


        
    }
}