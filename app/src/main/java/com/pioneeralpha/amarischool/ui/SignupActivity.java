package com.pioneeralpha.amarischool.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.core.Amplify;
import com.pioneeralpha.amarischool.R;

import com.pioneeralpha.amarischool.databinding.ActivitySignupBinding;
import com.pioneeralpha.amarischool.ui.home.HomePageActivity;
import com.pioneeralpha.amarischool.ui.login.LoginActivity;
import com.pioneeralpha.amarischool.ui.menu.webview.WebviewMenuitemActivity;

public class SignupActivity extends AppCompatActivity {
    private ActivitySignupBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.signupBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      awsSign();
                    }
                }
        );

        mBinding.SignUp.setOnClickListener(
                view -> {
                    Intent intent=new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                }
        );

        mBinding.textView151.setOnClickListener(
                view -> {
                    Intent intent=new Intent(getApplicationContext(), WebviewMenuitemActivity.class);
                    intent.putExtra("itemName", "termsofuse");
                    startActivity(intent);
                }
        );

        mBinding.textView153.setOnClickListener(
                view -> {
                    Intent intent=new Intent(getApplicationContext(), WebviewMenuitemActivity.class);
                    intent.putExtra("itemName", "privacypolicy");
                    startActivity(intent);
                }
        );
    }

    private void awsSign() {
        String email=mBinding.txtEmail.getText().toString();
        String password=mBinding.txtPass.getText().toString();
        String conNewPass=mBinding.txtConPass.getText().toString();
        String name = mBinding.txtName.getText().toString();
        if(email.isEmpty()){
            mBinding.txtEmail.setError("Email Required");
            mBinding.txtEmail.requestFocus();
            return;
        }
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (!email.matches(emailPattern))
        {
            mBinding.txtEmail.setError("Enter Valid Email Address");
            mBinding.txtEmail.requestFocus();
            return;
        }
        if(name.isEmpty()){
            mBinding.txtName.setError("Name Required");
            mBinding.txtName.requestFocus();
            return;
        }
        if(password.isEmpty()){
            mBinding.txtPass.setError("Password Required");
            mBinding.txtPass.requestFocus();
            return;
        }
        if (conNewPass.isEmpty()){
            mBinding.txtConPass.setError("Password required.");
            mBinding.txtConPass.requestFocus();

        }
        if(!password.equals(conNewPass)){
            mBinding.txtConPass.setError("Password doesn't match.");
            mBinding.txtConPass.requestFocus();
            return;
        }
        if(password.length()<6){
            mBinding.txtPass.setError("Password Should be atleast six character");
            mBinding.txtPass.requestFocus();
            return;
        }
        Amplify.Auth.signUp(
                mBinding.txtEmail.getText().toString(),
                mBinding.txtPass.getText().toString(),



                AuthSignUpOptions.builder().userAttribute(
                        AuthUserAttributeKey.email(), mBinding.txtEmail.getText().toString()
                ).build(),
                this::onJoinSuccess,
                this::onJoinError
        );
    }


    private void onJoinSuccess(AuthSignUpResult authSignUpResult) {

        Intent intent=new Intent(getApplicationContext(), EmailConfirmationActivity.class);
        intent.putExtra("name", mBinding.txtEmail.getText().toString());
        intent.putExtra("email", mBinding.txtEmail.getText().toString());
        intent.putExtra("password", mBinding.txtPass.getText().toString());

        startActivity(intent);
    }

    private void onJoinError(AuthException e) {
        this.runOnUiThread(() -> {
                    Toast.makeText(getApplicationContext(), ""+e.getMessage(), Toast.LENGTH_LONG)
                            .show();
                }
        );
    }


}