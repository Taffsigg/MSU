package com.example.tafadzwa.midlandsstateuniversity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstFragment  extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.menu, container, false);

        Button proobtn = (Button) myView.findViewById(R.id.programsbutton);
        Button lbtn = (Button)myView.findViewById(R.id.libtn);
        Button wel = (Button)myView.findViewById(R.id.wellycome);
        Button fbtn = (Button)myView.findViewById(R.id.feesbtn);
        Button nwsbtn = (Button )myView.findViewById(R.id.newsbtnn);
        Button ictbn = (Button)myView.findViewById(R.id.ictbtn);
        Button sbtn = (Button)myView.findViewById(R.id.sitebtn);
        Button scbtn = (Button)myView.findViewById(R.id.socialbtn);
        Button applybbtn = (Button)myView.findViewById(R.id.applybtn);
        Button admssnbtn = (Button)myView.findViewById(R.id.admissionbtn);
        Button sftybtn = (Button)myView.findViewById(R.id.safetybtn);
        Button infobtn = (Button)myView.findViewById(R.id.informationbtn);



        proobtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Programs.class);
                startActivity(in);
            }
        });

        lbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Library.class);
                startActivity(in);
            }
        });

        wel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), Welcome.class);
                startActivity(in);

            }
        });

        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), Fees.class);
                startActivity(in);
            }
        });

        nwsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), News.class);
                startActivity(in);

            }
        });

        ictbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), ICT.class);
                startActivity(in);

            }
        });

        sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), Site.class);
                startActivity(in);

            }
        });

        scbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), Social.class);
                startActivity(in);

            }
        });

        applybbtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Apply.class);
                startActivity(in);
            }
        });

        admssnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), Admissions.class);
                startActivity(in);

            }
        });

        sftybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), Safety.class);
                startActivity(in);


            }
        });

        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getActivity(), Information.class);
                startActivity(in);




            }
        });

        return myView;
    }
}
