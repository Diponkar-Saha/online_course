package com.pioneeralpha.amarischool.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.core.Amplify;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.pioneeralpha.amarischool.databinding.ActivityLoginBinding;
import com.pioneeralpha.amarischool.databinding.ActivitySignupBinding;
import com.pioneeralpha.amarischool.ui.SignupActivity;
import com.pioneeralpha.amarischool.ui.forget_password.ForgetPasswordActivity;
import com.pioneeralpha.amarischool.ui.home.HomePageActivity;
import com.pioneeralpha.amarischool.utils.MyPreferences;

import org.json.JSONException;
import org.json.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class LoginActivity extends AppCompatActivity {


    private CallbackManager callbackManager;
    private ActivityLoginBinding mBinding;
    private MyPreferences myPreferences;
    GoogleSignInClient mGoogleSignInClient;
    int RC_SIGN_IN=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        myPreferences = MyPreferences.getPreferences(this);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);


        mBinding.signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });


        //setContentView(R.layout.activity_main);
        //info = (TextView)findViewById(R.id.info);

//        try {
//            PackageInfo info = getPackageManager().getPackageInfo(
//                    "com.pioneeralpha.amarischool",
//                    PackageManager.GET_SIGNATURES);
//            for (Signature signature : info.signatures) {
//                MessageDigest md = MessageDigest.getInstance("SHA");
//                md.update(signature.toByteArray());
//                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
//            }
//        }
//        catch (PackageManager.NameNotFoundException e) {
//        }
//        catch (NoSuchAlgorithmException e) {
//        }

        mBinding.facebookLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setUpFb();
            }
        });



        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            String j =(String) b.get("loginName");
            mBinding.laterHomePage.setVisibility(View.GONE);
        }




        mBinding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginAws();

            }


        });
        mBinding.laterHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToHomeActivity();
            }
        });





        mBinding.SignUp.setOnClickListener(
                view -> {
                    Intent intent=new Intent(getApplicationContext(), SignupActivity.class);
                    startActivity(intent);
                }
        );

        mBinding.forgotPass.setOnClickListener(
                view -> {
                    Intent intent=new Intent(getApplicationContext(), ForgetPasswordActivity.class);
                    startActivity(intent);
                }
        );
    }

    private void setUpFb() {
        FacebookSdk.sdkInitialize(getApplicationContext());

        callbackManager = CallbackManager.Factory.create();

        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("email","user_photos","public_profile"));

        LoginManager.getInstance().registerCallback( callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        Toast.makeText(LoginActivity.this, ""+loginResult, Toast.LENGTH_SHORT).show();

                        System.out.println("Success");
                        GraphRequest.newMeRequest(
                                loginResult.getAccessToken(), (json, response) -> {
                                    if (response.getError() != null) {
                                        Toast.makeText(getApplicationContext(), "false"+response, Toast.LENGTH_LONG)
                                                .show();
                                        // handle error
                                        System.out.println("ERROR  vv");
                                    } else {
                                        Toast.makeText(getApplicationContext(), "str"+response, Toast.LENGTH_LONG)
                                                .show();
                                        System.out.println("Success");
                                        Map<String, String> logins = new HashMap<String, String>();
                                        logins.put("graph.facebook.com", AccessToken.getCurrentAccessToken().getToken());
                                       // credentialsProvider.setLogins(logins);
                                        goToHomeActivity();
//                                        try {
//
//                                            String jsonresult = String.valueOf(json);
//                                            System.out.println("JSON yy   Result"+jsonresult);
//
//                                            String str_email = json.getString("email");
//                                            String str_id = json.getString("id");
//                                            String str_firstname = json.getString("first_name");
//                                            String str_lastname = json.getString("last_name");
//                                            Toast.makeText(getApplicationContext(), "str"+str_id+str_email, Toast.LENGTH_LONG)
//                                                    .show();
//                                            goToHomeActivity();
//
//
//                                        } catch (JSONException e) {
//                                            e.printStackTrace();
//                                        }
                                    }
                                }).executeAsync();

                    }

                    @Override
                    public void onCancel() {

                    }

                    @Override
                    public void onError(FacebookException error) {

                    }
                });

//        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("user_photos", "email", "public_profile", "user_posts"));
//        LoginManager.getInstance().logInWithPublishPermissions(this, Arrays.asList("publish_actions"));
//        LoginManager.getInstance().registerCallback(callbackManager,
//                new FacebookCallback<LoginResult>()
//                {
//                    @Override
//                    public void onSuccess(LoginResult loginResult)
//                    {
//                        // App code
//                        Toast.makeText(getApplicationContext(), "str"+loginResult, Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onCancel()
//                    {
//                        // App code
//                        Toast.makeText(getApplicationContext(), "str", Toast.LENGTH_LONG).show();
//
//
//
//                    }
//
//                    @Override
//                    public void onError(FacebookException exception)
//                    {
//                        // App code
//                        Toast.makeText(getApplicationContext(), "str"+exception, Toast.LENGTH_LONG).show();
//                    }
//                });
    }

    private void loginAws() {

        String email= mBinding.editEmail.getText().toString();
        String password = mBinding.editPassword.getText().toString();

        if(email.isEmpty()){
            mBinding.editEmail.setError("Email Required");
            mBinding.editEmail.requestFocus();
            return;
        }
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if (!email.matches(emailPattern))
        {
            mBinding.editEmail.setError("Enter Valid Email Address");
            mBinding.editEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            mBinding.editPassword.setError("Password Required");
            mBinding.editPassword.requestFocus();
            return;
        }
        if(password.length()<6){
            mBinding.editPassword.setError("Password Should be atleast six character");
            mBinding.editPassword.requestFocus();
            return;
        }

        Amplify.Auth.signIn(
                mBinding.editEmail.getText().toString(),
                mBinding.editPassword.getText().toString(),
                this::onLoginSuccess,
                this::onLoginError

        );

//           String userId = Amplify.Auth.getCurrentUser().getUserId().toString();
        Toast.makeText(LoginActivity.this, "login", Toast.LENGTH_LONG)
                    .show();

    }


    private void goToHomeActivity() {
        startActivity(
                new Intent(this, HomePageActivity.class)
        );
        finish();
    }

    private void onLoginError(AuthException e) {
        this.runOnUiThread(() -> {
                    Toast.makeText(getApplicationContext(),"Sorry,Try Again", Toast.LENGTH_LONG)
                            .show();
                }
        );

    }

    private void onLoginSuccess(AuthSignInResult authSignInResult) {
        //Go to the chat screen
        goToHomeActivity();
        myPreferences.setCheckUserLogin("userlogin");
    }
    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    protected void onActivityResult(int requestCode, int responseCode,
                                    Intent data) {
        super.onActivityResult(requestCode, responseCode, data);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
        callbackManager.onActivityResult(requestCode, responseCode, data);
    }
    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);

            // Signed in successfully, show authenticated UI.
            goToHomeActivity();
        } catch (ApiException e) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.

            Toast.makeText(this, "Sorry,Try Again.", Toast.LENGTH_SHORT).show();
        }
    }




}