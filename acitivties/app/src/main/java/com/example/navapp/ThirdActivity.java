package com.example.navapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button btn3 = findViewById(R.id.btn3);
        TextView tv3 = findViewById(R.id.tv3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myThirdMeowIntent = new Intent(Intent.ACTION_VIEW);
                myThirdMeowIntent.setData(Uri.parse("https://portal.mec.edu.om/"));
                startActivity(myThirdMeowIntent);
            }
        });
    }
}