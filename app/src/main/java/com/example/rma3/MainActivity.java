package com.example.rma3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random myRandom = new Random();

        Button buttonGenerate = (Button)findViewById(R.id.generate);
        final TextView textGenerateNumber = (TextView)findViewById(R.id.generatenumber);

        buttonGenerate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                textGenerateNumber.setText(String.valueOf(myRandom.nextInt(100)));
            }
        });
            }
            public void Add(View v){
                EditText et1=(EditText)findViewById(R.id.editTextNumber);
                EditText et2=(EditText)findViewById(R.id.editTextNumber2);
                EditText et3=(EditText)findViewById(R.id.editTextNumber3);

                int n1= Integer.parseInt(et1.getText().toString());
                int n2= Integer.parseInt(et2.getText().toString());
                int result= n1+n2;

                et3.setText("Total Value"+ result);
            }
    public void Subtract(View v){
        EditText et1=(EditText)findViewById(R.id.editTextNumber);
        EditText et2=(EditText)findViewById(R.id.editTextNumber2);
        EditText et3=(EditText)findViewById(R.id.editTextNumber3);

        int n1= Integer.parseInt(et1.getText().toString());
        int n2= Integer.parseInt(et2.getText().toString());
        int result= n1-n2;

        et3.setText("Subtract Value"+ result);
    }
}