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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    private EditText mloginEmail;
    private EditText mLoginpassword;
    private Button mLoginButton;
    private FirebaseAuth mAuth;
    private ProgressDialog mLoginProgress;
    private Button mRegActivity;
    private Button mVisitor;
    private TextView mPassy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginProgress = new ProgressDialog(this);

        mAuth = FirebaseAuth.getInstance();

        mloginEmail = (EditText) findViewById(R.id.login_email);
        mLoginpassword = (EditText) findViewById(R.id.login_password);
        mLoginButton = (Button) findViewById(R.id.login_button);
        mRegActivity = (Button) findViewById(R.id.Re);
        mVisitor = (Button) findViewById(R.id.Visitor);


        mVisitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainIntent = new Intent(Login.this, Main2Activity.class);
                startActivity(mainIntent);
                finish();

            }
        });

        mRegActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainIntent = new Intent(Login.this, Register.class);
                startActivity(mainIntent);
                finish();

            }
        });

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String lemail = mloginEmail.getText().toString();
                String lpassword = mLoginpassword.getText().toString();

                if (!TextUtils.isEmpty(lemail) || !TextUtils.isEmpty(lpassword)) ;

                mLoginProgress.setTitle("Logging In");
                mLoginProgress.setMessage("Please wait while we check your credentials ");
                mLoginProgress.setCanceledOnTouchOutside(false);
                mLoginProgress.show();

                loginUser(lemail, lpassword);


            }
        });

    }

    private void loginUser(String lemail, String lpassword) {

        mAuth.signInWithEmailAndPassword(lemail, lpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()) {

                    Intent mainIntent = new Intent(Login.this, Main2Activity.class);
                    mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(mainIntent);
                    finish();
                } else {
                    Toast.makeText(Login.this, "Cannot Sign, Please Check Credentials", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
