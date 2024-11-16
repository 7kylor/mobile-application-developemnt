package com.example.ibm;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    CalcIBM cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cl = new CalcIBM();

        Button btn = findViewById(R.id.BTN1);
        Button btn2 = findViewById(R.id.BTN2);
        TextView TV1 = findViewById(R.id.TV1);

        EditText ET1 = findViewById(R.id.ET1);
        EditText ET2 = findViewById(R.id.ET2);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV1.setText("the IBM =");
                ET2.setText("");
                ET1.setText("");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wh = (ET1.getText().toString());
                String ht = (ET2.getText().toString());
                if (wh.isEmpty() || ht.isEmpty()){
                    TV1.setText("Please Enter both values first");
                } else {
                    try{
                        Double w =  Double.parseDouble((ET1.getText().toString()));
                        Double h =  Double.parseDouble((ET1.getText().toString()));
                        Double result =  cl.calcIBM(w,h);
                        TV1.setText(result.toString());
                    } catch (NumberFormatException e) {
                        TV1.setText("Invalid Data! please write a valid input data!");
                    }

                }

            }
        });
    }


}