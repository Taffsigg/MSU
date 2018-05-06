package com.example.tafadzwa.midlandsstateuniversity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SeventhFragment extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.navigation, container, false);

        Button em = (Button)myView.findViewById(R.id.emeee);
        Button navv = (Button)myView.findViewById(R.id.navvv);

        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Cal.class);
                startActivity(in);

            }
        });


        navv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Maps.class);
                startActivity(in);

            }
        });


        return myView;
    }
}
