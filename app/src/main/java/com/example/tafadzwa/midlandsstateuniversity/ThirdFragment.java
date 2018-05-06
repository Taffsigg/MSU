package com.example.tafadzwa.midlandsstateuniversity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ThirdFragment extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.portal, container, false);

        Button proobtn = (Button) myView.findViewById(R.id.staffbn);
        Button probtn = (Button) myView.findViewById(R.id.stdbn);

        proobtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), StaffPortal.class);
                startActivity(in);
            }
        });

        probtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), StudentPortal.class);
                startActivity(in);
            }
        });

        return myView;
    }
}
