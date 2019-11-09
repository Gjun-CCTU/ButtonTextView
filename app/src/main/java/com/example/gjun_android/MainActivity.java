package com.example.gjun_android;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
//        buttonSetOnClickListener();
        View.OnClickListener OCL = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Button btnClick = (Button)v;
                 int id = btnClick.getId();
                Toast.makeText(MainActivity.this,"ID =" + id, Toast.LENGTH_SHORT).show();
                 switch(id){
                     case R.id.button:
                         tv.setBackgroundColor(Color.RED);
                         tv.setText(btn1.getText());
                         tv.setTextSize(40);
                         tv.setTextColor(Color.MAGENTA);
                     break;

                     case R.id.button2:
                         tv.setBackgroundColor(Color.GREEN);
                         tv.setText(btn2.getText());
                         tv.setTextSize(30);
                         tv.setTextColor(Color.YELLOW);
                         break;

                     case R.id.button3:
                         tv.setBackgroundColor(Color.BLUE);
                         tv.setText(btn1.getText());
                         tv.setTextSize(20);
                         tv.setTextColor(Color.GRAY);
                         break;

                     case R.id.button4:
                         tv.setText(btn1.getText());
                         tv.setTextSize(0);
                         finish();
                         break;
                 }
            }
        };
        btn1.setOnClickListener(OCL);
        btn2.setOnClickListener(OCL);
        btn3.setOnClickListener(OCL);
        btn4.setOnClickListener(OCL);
    }

    private void buttonSetOnClickListener() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setBackgroundColor(Color.RED);
                tv.setText(btn1.getText());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setBackgroundColor(Color.GREEN);
                tv.setText(btn2.getText());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setBackgroundColor(Color.BLUE);
                tv.setText(btn3.getText());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(btn4.getText());
                finish();
            }
        });
    }

    public void findViewById() {
        tv = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
    }

//    public void btn1(View v){
//        tv.setBackgroundColor(Color.RED);
//    }
//
//    public void btn2(View v){
//        tv.setBackgroundColor(Color.GREEN);
//    }
//
//    public void btn3(View v){
//        tv.setBackgroundColor(Color.BLUE);
//    }
//
//    public void btn4(View v){
//        finish();
//    }
}
