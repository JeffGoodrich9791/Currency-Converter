package com.example.jeffg.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void convert(View View) {

        EditText dollarAmountEditText = (EditText) findViewById(R.id.currencyText);


        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());

        Double pountAmount = dollarAmountDouble * 0.75;

        Toast.makeText(this, "Pounds: " + "" + String.format("%.2f", pountAmount), Toast.LENGTH_SHORT).show();



    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
