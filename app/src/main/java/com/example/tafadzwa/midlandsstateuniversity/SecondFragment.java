package com.example.tafadzwa.midlandsstateuniversity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondFragment extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.school, container, false);


        Button zvis = (Button) myView.findViewById(R.id.zvishbtn);
        Button mani = (Button)myView.findViewById(R.id.manicabtn);
        Button gradu= (Button)myView.findViewById(R.id.gradbtn);

        zvis.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Zvishcampus.class);
                startActivity(in);
            }
        });

        mani.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Manicampus.class);
                startActivity(in);
            }
        });

        gradu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), GraduateCampus.class);
                startActivity(in);

            }
        });

        return myView;
    }
}
