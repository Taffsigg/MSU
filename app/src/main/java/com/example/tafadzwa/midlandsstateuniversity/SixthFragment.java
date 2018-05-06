package com.example.tafadzwa.midlandsstateuniversity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SixthFragment extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.connect, container, false);

        Button bsbs = (Button)myView.findViewById(R.id.bss);
        Button spoo = (Button)myView.findViewById(R.id.spoot);
        Button shopnslll = (Button)myView.findViewById(R.id.shopnsellbtn);
        Button mealls = (Button)myView.findViewById(R.id.meallsbtn);
        Button lostnfounddd = (Button)myView.findViewById(R.id.lostnfoundbtn);
        Button rt = (Button)myView.findViewById(R.id.intbtn);
        Button careeer = (Button)myView.findViewById(R.id.carerbtn);

        careeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Career.class);
                startActivity(in);

            }
        });


        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Entertainment.class);
                startActivity(in);

            }
        });



        lostnfounddd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), LostandFound.class);
                startActivity(in);

            }
        });


        mealls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Meals.class);
                startActivity(in);

            }
        });



        shopnslll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Shopnsell.class);
                startActivity(in);

            }
        });




        bsbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Buseeses.class);
                startActivity(in);

            }
        });

        spoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Sports.class);
                startActivity(in);

            }
        });

        return myView;
    }
}
