package com.example.mocktest2;

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

        Test re = new Test();

        Button btn = findViewById(R.id.BNT);
        TextView tv = findViewById(R.id.result);
        EditText ed1 = findViewById(R.id.ED1);
        EditText ed2 = findViewById(R.id.ED2);
        EditText ed3 = findViewById(R.id.ED3);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().trim().isEmpty() || 
                    ed2.getText().toString().trim().isEmpty() || 
                    ed3.getText().toString().trim().isEmpty()) {
                    tv.setText("Please enter all the fields");
                    return;
                }

                try {
                    double targetAmount = Double.parseDouble(ed1.getText().toString().trim());
                    double currentSavings = Double.parseDouble(ed2.getText().toString().trim());
                    double months = Double.parseDouble(ed3.getText().toString().trim());

                    if (months <= 0) {
                        tv.setText("Months must be greater than 0");
                        return;
                    }
                    if (targetAmount <= currentSavings) {
                        tv.setText("Target amount must be greater than current savings");
                        return;
                    }

                    double monthlyGoal = re.calculateMonthlySavingsGoal(targetAmount, currentSavings, months);
                    String formattedResult = String.format("Monthly Savings Goal: $%.2f", monthlyGoal);
                    tv.setText(formattedResult);

                } catch (NumberFormatException e) {
                    tv.setText("Please enter valid numbers");
                }
            }
        });
    }
}