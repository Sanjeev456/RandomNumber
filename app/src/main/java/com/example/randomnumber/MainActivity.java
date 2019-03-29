package com.example.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private Button btn1,btn2;
        private TextView tvoutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        tvoutput=findViewById(R.id.tvoutput);

        RandomActivity ran=new RandomActivity();




    }
}
