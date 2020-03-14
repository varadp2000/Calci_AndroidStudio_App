package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    private double num1,num2;
    private boolean isDot=false;
    private String op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b1= findViewById(R.id.btnOne);
        final Button b2= findViewById(R.id.btnTwo);
        final Button b3= findViewById(R.id.btnThree);
        final Button b4= findViewById(R.id.btnFour);
        final Button b5= findViewById(R.id.btnFive);
        final Button b6= findViewById(R.id.btnSix);
        final Button b7= findViewById(R.id.btnSeven);
        final Button b8= findViewById(R.id.btnEight);
        final Button b9= findViewById(R.id.btnNine);
        final Button b0= findViewById(R.id.btnZero);
        final Button add= findViewById(R.id.btnAdd);
        final Button sub= findViewById(R.id.btnSub);
        final Button div= findViewById(R.id.btnDivide);
        final Button mul= findViewById(R.id.btnMultiply);
        final Button clear= findViewById(R.id.btnClear);
        final Button eq= findViewById(R.id.btnEqual);
        final TextView ans=findViewById(R.id.txtDisplay);
        final Button dot=findViewById(R.id.btnDot);


        b1.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append("1");
            }
        });
        b2.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append("2");
            }
        });
        b3.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append("3");
            }
        });
        b4.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append("4");
            }
        });
        b5.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append("5");
            }
        });
        b6.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append("6");
            }
        });
        b7.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append("7");
            }
        });
        b8.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append("8");
            }
        });
        b9.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append("9");
            }
        });
        b0.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append("0");
            }
        });
        clear.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.setText("");
            }
        });
        add.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append(" + ");
                isDot=true;
            }
        });
        sub.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append(" - ");
                isDot=true;
            }
        });
        mul.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append(" * ");
                isDot=true;
            }
        });
        div.setOnClickListener(new OnClickListener(){
            public void onClick(View V){
                ans.append(" / ");
                isDot=true;
            }
        });
        dot.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                ans.append(".");

            };
        });
        eq.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String[] s1=ans.getText().toString().split(" ");
                num1=Double.parseDouble(s1[0]);
                num2=Double.parseDouble(s1[2]);
                op=s1[1];
                DecimalFormat d=new DecimalFormat();
                if(isDot==true) {
                    switch (op) {
                        case "+":
                            ans.setText(d.format(num1 + num2));
                            break;
                        case "-":
                            ans.setText(d.format(num1 - num2));
                            break;
                        case "*":
                            ans.setText(d.format(num1 * num2));
                            break;
                        case "/":
                            ans.setText(d.format(num1 / num2));
                            break;
                    }
                }
                else{
                    ans.setText(s1[0]);
                }

            }
        });

    }
}
