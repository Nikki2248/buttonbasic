package com.example.rocket.buttonbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView showValue;
int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showValue = (TextView) findViewById(R.id.counterValue);
    }

 public void countIN(View view)
 {
  counter++;
  showValue.setText(Integer.toString(counter));


 }
    public void countDE(View view)
    {
        counter--;
        showValue.setText(Integer.toString(counter));


    }
    public void resetCount(View view)
    {
        counter = 0;
        showValue.setText(String.valueOf(counter));


    }



}
