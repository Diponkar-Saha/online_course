package com.pioneeralpha.amarischool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.core.Amplify;
import com.pioneeralpha.amarischool.ui.home.HomePageActivity;
import com.pioneeralpha.amarischool.ui.login.LoginActivity;
import com.pioneeralpha.amarischool.utils.MyPreferences;

public class SplashActivity extends AppCompatActivity {

    static int TIMEOUT_MILLIS = 3000;
    private MyPreferences myPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        myPreferences = MyPreferences.getPreferences(this);



        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                AuthUser currentUser = Amplify.Auth.getCurrentUser();

                Intent intent;
                if(currentUser == null){

                    intent = new Intent(getApplicationContext(), LoginActivity.class);
                }else {

                    intent = new Intent(getApplicationContext(), HomePageActivity.class);
                    myPreferences.setCheckUserLogin("userlogin");
                }

                // Start activity
                startActivity(intent);
                finish();


            }
        }, TIMEOUT_MILLIS);



    }
}