package com.example.geek_sharbel.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn00 = findViewById(R.id.btn_b00);
        Button btn01 = findViewById(R.id.btn_b01);
        Button btn02 = findViewById(R.id.btn_b02);
        Button btn10 = findViewById(R.id.btn_b10);
        Button btn11 = findViewById(R.id.btn_b11);
        Button btn12 = findViewById(R.id.btn_b12);
        Button btn20 = findViewById(R.id.btn_b20);
        Button btn21 = findViewById(R.id.btn_b21);
        Button btn22 = findViewById(R.id.btn_b22);
        Button reset_btn = findViewById(R.id.btn_reset);
        TextView TvscoreInfo = findViewById(R.id.tv_scoreInfo);


    }
}
