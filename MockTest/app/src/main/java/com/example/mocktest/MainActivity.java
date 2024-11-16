package com.example.mocktest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        SavingsGoal goal = new SavingsGoal();

        Button btn = findViewById(R.id.BTN1);
        TextView tv1 = findViewById(R.id.TV1);
        EditText ed1 = findViewById(R.id.ED1);
        EditText ed2 = findViewById(R.id.ED2);
        EditText ed3 = findViewById(R.id.ED3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double target = Double.parseDouble(ed1.getText().toString());
                Double savings = Double.parseDouble(ed2.getText().toString());
                Double time = Double.parseDouble(ed3.getText().toString());
                Double res = goal.Calculate_Monthly_Savings_Goal(target,savings,time);
                String ResValue = res.toString();
                tv1.setText(ResValue);

            }
        });
    }
}