package com.example.tafadzwa.midlandsstateuniversity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {



    private EditText mName;
    private EditText mEmail;
    private EditText mPassword;
    private Button mRegister;
    private FirebaseAuth mAuth;
    private ProgressDialog mRegProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mRegProgress = new ProgressDialog(this);

        mAuth = FirebaseAuth.getInstance();

        mName= (EditText)findViewById(R.id.reg_name);
        mEmail= (EditText)findViewById(R.id.reg_email);
        mPassword=(EditText)findViewById(R.id.reg_password);
        mRegister=(Button)findViewById(R.id.reg_create_button);



        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name = mName.getText().toString();
                String email = mEmail.getText().toString();
                String password = mPassword.getText().toString();

                if(!TextUtils.isEmpty(email)||!TextUtils.isEmpty(password)||!TextUtils.isEmpty(name));

                mRegProgress.setTitle("Registering User");
                mRegProgress.setMessage("Please wait while we register your credentials ");
                mRegProgress.setCanceledOnTouchOutside(false);
                mRegProgress.show();

                register_user(name,email,password);

            }
        });


    }

    private void register_user (String name, String email, String password){

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()) {

                    Intent mainIntent = new Intent(Register.this, Login.class);
                    mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(mainIntent);
                    finish();
                } else {
                    Toast.makeText(Register.this, "You got some error", Toast.LENGTH_LONG).show();
                }

            }
        });
        // ...
    }


}

