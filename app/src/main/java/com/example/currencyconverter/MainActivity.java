package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText Amount_editText;
    public TextView InRupees_editText;

    public void convertCurrency(View view){

        Log.i("Info","Button Pressed");

        this.Amount_editText = findViewById(R.id.Amount_editText);
        this.InRupees_editText = findViewById(R.id.InRupees_editText);

        String amountInYen = Amount_editText.getText().toString();

        double amountInYenDouble = Double.parseDouble(amountInYen);

        double amountInRupeesDouble = amountInYenDouble * 0.65;

        String amountInRupeesDoubleString = Double.toString(amountInRupeesDouble);

        InRupees_editText.setText(amountInRupeesDoubleString);

        Log.i("amount in rupees",amountInRupeesDoubleString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*double amountInRupeesDouble = 0;
        double InRupees_editText=amountInRupeesDoubleString.setText().toString();*/
    }


}
