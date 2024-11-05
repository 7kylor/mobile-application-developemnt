package com.example.week4_desgin_ui_unit_test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView res;
    EditText wage;
    EditText hours;
    myCalc cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        res = findViewById(R.id.t1);
        wage = findViewById(R.id.ed1);
        hours = findViewById(R.id.ed2);

        cal = new myCalc();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w = Double.parseDouble(wage.getText().toString());
                double h = Double.parseDouble(hours.getText().toString());
                String result = cal.getSalary(w, h).toString();
                res.setText("Salary is " + result);
            }
        });
    }
}
