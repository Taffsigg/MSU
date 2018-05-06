package com.example.tafadzwa.midlandsstateuniversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cal extends AppCompatActivity {

    private Button h;
    private Button s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        h = (Button)findViewById(R.id.calht);
        s = (Button)findViewById(R.id.calsec);

        h.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(Cal.this, Emergencycall.class);
                startActivity(mainIntent);
                finish();
            }
        });

        s.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(Cal.this, Securitycall.class);
                startActivity(mainIntent);
                finish();
            }
        });
    }
}
