package com.pioneeralpha.amarischool.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.DataStoreItemChange;
import com.pioneeralpha.amarischool.databinding.ActivityEmailConfirmationBinding;
import com.pioneeralpha.amarischool.ui.home.HomePageActivity;

public class EmailConfirmationActivity extends AppCompatActivity {
    private ActivityEmailConfirmationBinding mBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityEmailConfirmationBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmSignUp();

            }
        });
    }

    private void confirmSignUp() {

        if(mBinding.txtConfirmationCode.getText().toString().isEmpty()){
            mBinding.txtConfirmationCode.setError("Enter Confirm Code");
            mBinding.txtConfirmationCode.requestFocus();
            return;
        }

        Amplify.Auth.confirmSignUp(
                getEmail(),
                mBinding.txtConfirmationCode.getText().toString(),
                this::onSuccess,
                this::onError
        );
    }

    private void onError(AuthException e) {
        runOnUiThread(() -> Toast
                .makeText(getApplicationContext(), "Sorry,Try Again.", Toast.LENGTH_LONG)
                .show());
    }

    private void onSuccess(AuthSignUpResult authSignUpResult) {
        reLogin();
    }

    private void reLogin() {
        String email = getEmail();
        String name = getName();
        String password = getPassword();

        Amplify.Auth.signIn(
                email,
                password,
                this::onLoginSuccess,
                this::onError
        );
    }

    private void onLoginSuccess(AuthSignInResult authSignInResult) {

        String email = getEmail();
        String name = getName();
       // String userId = Amplify.Auth.getCurrentUser().getUserId();


        Toast.makeText(this, "login Succ", Toast.LENGTH_LONG)
                .show();

        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);

//            Amplify.DataStore.save(
//                    User.builder().id(userId).email(email).name(name).build(),
//                    this::onSavedSuccess,
//                    this::onError
//            );


    }

    private <T extends Model> void onSavedSuccess(DataStoreItemChange<T> tDataStoreItemChange) {
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);
    }

    private void onError(DataStoreException e) {
        runOnUiThread(() -> Toast
                .makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG)
                .show());
    }
    private String getName() {
        return getIntent().getStringExtra("name");
    }



    private String getPassword() {
        return getIntent().getStringExtra("password");
    }

    private String getEmail() {
        return getIntent().getStringExtra("email");
    }
}