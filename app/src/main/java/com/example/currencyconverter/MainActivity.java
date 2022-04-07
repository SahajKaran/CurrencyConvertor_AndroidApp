package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

    Log.i("Information","Conver button pressed");

    EditText amount=(EditText) findViewById(R.id.money);

    String amountInCad=amount.getText().toString();

    double amountInCadDouble=Double.parseDouble(amountInCad);
    double amountInRs=amountInCadDouble*60.15;

    String amountInRsString= String.format("%.2f" , amountInRs);

    Toast.makeText(this, amountInCad+ " Cad = "+ amountInRsString +" Rs", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}