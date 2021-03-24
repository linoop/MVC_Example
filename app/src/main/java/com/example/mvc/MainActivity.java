package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer, View.OnClickListener {

    private Button buttonClickMe;
    private TextView textViewCount;
    private Model model;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClickMe=findViewById(R.id.buttonClickMe);
        textViewCount=findViewById(R.id.textViewCount);

        buttonClickMe.setOnClickListener(this);

        model = new Model();
        model.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
            textViewCount.setText("Count "+model.getCount());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
           case  R.id.buttonClickMe:{
               Toast.makeText(this,"Clicked me",Toast.LENGTH_LONG).show();
               model.setCount(++count);
            }
            break;
        }
    }
}