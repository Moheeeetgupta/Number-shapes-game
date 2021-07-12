package com.mohit.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number{

        int number;
        public boolean issquare(){
            double  squareRoot=Math.sqrt(number);
            if(squareRoot == Math.floor(squareRoot))
            {return true;
            }
            else{
                return false;
            }
        }

        public boolean isTriangular(){
            int x =1;
            int Triangularnumber=0;
            while(Triangularnumber<number)
            {
                Triangularnumber=x*(x+1)/2;
                x++;
            }


            if (Triangularnumber==number)
            {
                return true;
            }
            else
            {
                return false;
            }

        }
    }
    public void testNumber(View view){
        EditText editText = (EditText)findViewById(R.id.editText);
        if(editText.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please enter any number", Toast.LENGTH_SHORT).show();
        }else {

            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(editText.getText().toString());
            if (myNumber.isTriangular() && myNumber.issquare()) {
                Toast.makeText(this, "It is both traingular  and square number", Toast.LENGTH_SHORT).show();
            } else if (myNumber.isTriangular()) {
                Toast.makeText(this, "It is traingular   number", Toast.LENGTH_SHORT).show();
            } else if (myNumber.issquare()) {
                Toast.makeText(this, "It is square  number", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "It is neither a traingular nor a square number", Toast.LENGTH_SHORT).show();
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
