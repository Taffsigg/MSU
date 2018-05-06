package com.example.tafadzwa.midlandsstateuniversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Programs extends AppCompatActivity {
    private TextView mUndergrady;
    private TextView mMasty;
    private  TextView mPosty;
    private TextView Diply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);

        mUndergrady = (TextView) findViewById(R.id.undergraduatedegree);
        mMasty = (TextView) findViewById(R.id.mastersdegree);
        mPosty = (TextView)findViewById(R.id.postgraduatedegreee);

        mUndergrady.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(Programs.this, Undergraduate.class);
                startActivity(mainIntent);
                finish();
            }
        });



        mMasty.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(Programs.this, Mastersdegree.class);
                startActivity(mainIntent);
                finish();
            }
        });

        mPosty.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(Programs.this, Postgraduateee.class);
                startActivity(mainIntent);
                finish();
            }
        });

    }

}
