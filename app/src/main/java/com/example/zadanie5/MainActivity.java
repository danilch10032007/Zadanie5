package com.example.zadanie5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText massIn;
    private Button button;
    private TextView fuelMarsOut;
    private String mass = "";

Algorithm algorithm = new Algorithm();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        massIn = findViewById(R.id.massIn);
        button =findViewById(R.id.button);
       fuelMarsOut = findViewById(R.id.fuelMarsOut);
       button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mass = massIn.getText().toString();

            fuelMarsOut.setText("Чтобы можн о было данный груз вывести на орбиту Марса необходимо " + algorithm.fuelMars(mass) + "кг топлива");
        }
    };
}