package com.example.calc;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView edt;
    Integer c,d,r,b;
    String a="0",aa;


    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt= findViewById(R.id.editText1);
        b1= findViewById(R.id.button1);
        b2= findViewById(R.id.button2);
        b3= findViewById(R.id.button3);
        b4= findViewById(R.id.button4);
        b5= findViewById(R.id.button5);
        b6= findViewById(R.id.button6);
        b7= findViewById(R.id.button7);
        b8= findViewById(R.id.button8);
        b9= findViewById(R.id.button9);
        b10= findViewById(R.id.button0);
        b11= findViewById(R.id.button11);
        b12= findViewById(R.id.button12);
        b13= findViewById(R.id.button13);
        b14= findViewById(R.id.button14);
        b15= findViewById(R.id.button15);
        b16= findViewById(R.id.button16);



        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("result", edt.getText().toString().trim());
            intent.putExtras(bundle);
            startActivity(intent);
        }

        b1.setOnClickListener(v -> {


            a=edt.getText().toString();
            a=a+"1";
            edt.setText(a);

        });

        b2.setOnClickListener(v -> {


            a=edt.getText().toString();
            a=a+"2";
            edt.setText(a);
        });

        b3.setOnClickListener(v -> {
            a=edt.getText().toString();
            a=a+"3";
            edt.setText(a);
        });


        b4.setOnClickListener(v -> {
            a=edt.getText().toString();
            a=a+"4";
            edt.setText(a);

        });


        b5.setOnClickListener(v -> {

            a=edt.getText().toString();
            a=a+"5";
            edt.setText(a);

        });


        b6.setOnClickListener(v -> {
            // TODO Auto-generated method stub

            a=edt.getText().toString();
            a=a+"6";
            edt.setText(a);
        });


        b7.setOnClickListener(v -> {

            a=edt.getText().toString();
            a=a+"7";
            edt.setText(a);
        });


        b8.setOnClickListener(v -> {
            // TODO Auto-generated method stub

            a=edt.getText().toString();
            a=a+"8";
            edt.setText(a);

        });


        b9.setOnClickListener(v -> {
            // TODO Auto-generated method stub

            a=edt.getText().toString();
            a=a+"9";
            edt.setText(a);
        });


        b10.setOnClickListener(v -> {
            // TODO Auto-generated method stub

            a=edt.getText().toString();
            a=a+"0";
            edt.setText(a);
        });


        b11.setOnClickListener(v -> {

            aa=a;
            b=1;
            a="";
            edt.setText("+");

            edt.setText("");
        });





        b12.setOnClickListener(v -> {

            aa=a;
            b=2;
            a="";
            edt.setText("-");
            edt.setText("");

        });


        b13.setOnClickListener(v -> {
            aa=a;
            b=3;
            a="";
            edt.setText("*");
            edt.setText("");

        });



        b14.setOnClickListener(v -> {
            aa=a;
            b=4;
            a="";
            edt.setText("/");
            edt.setText("");

        });


        b15.setOnClickListener(v -> {

            if(b==1){
                c=Integer.parseInt(aa);

                d=Integer.parseInt(a);
                r=c+d;
            }
            else
            if(b==4){
                c=Integer.parseInt(aa);
                d=Integer.parseInt(a);
                r=c/d;
            }else
            if(b==2){
                c=Integer.parseInt(aa);
                d=Integer.parseInt(a);
                r=c-d;
            }
            else
            if(b==3){
                c=Integer.parseInt(aa);
                d=Integer.parseInt(a);
                r=c*d;
            }
            Toast.makeText(MainActivity.this, "The Result is equal: "+r, Toast.LENGTH_SHORT).show();
            c=0;
            b=0;
            d=0;
            a="";
            aa="";
            edt.setText("");
        });


        b16.setOnClickListener(v -> {
            // TODO Auto-generated method stub

            edt.setText("");
        });

    }
}