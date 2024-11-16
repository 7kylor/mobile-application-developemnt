package com.example.mocktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        TextView tv = findViewById(R.id.tv1);
        EditText tg_amount = findViewById(R.id.edt1);
        EditText saving = findViewById(R.id.edt2);
        EditText time = findViewById(R.id.edt3);

        helper md = new helper();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double tg = Double.parseDouble(tg_amount.getText().toString());
                Double sv = Double.parseDouble(saving.getText().toString());
                Double tm = Double.parseDouble(time.getText().toString());

               tv.setText("Result "+md.Calculate_Monthly_Savings_Goal(tg, sv,tm).toString());



            }
        });

    }
}