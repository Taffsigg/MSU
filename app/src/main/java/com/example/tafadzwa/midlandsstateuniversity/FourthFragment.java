package com.example.tafadzwa.midlandsstateuniversity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FourthFragment extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.accomodation, container, false);

        Button Gwr = (Button)myView.findViewById(R.id.gwerubtnn);
        Button Zvi = (Button)myView.findViewById(R.id.zvishavanebtnn);



        Gwr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Gweru.class);
                startActivity(in);


            }
        });

        Zvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), Zvishavaane.class);
                startActivity(in);


            }
        });


        return myView;
    }
}
