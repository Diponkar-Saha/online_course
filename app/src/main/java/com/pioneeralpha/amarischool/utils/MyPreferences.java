package com.pioneeralpha.amarischool.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class MyPreferences {
    private static MyPreferences myPreferences;
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;


    private MyPreferences(Context context) {
        sharedPreferences = context.getSharedPreferences(Config.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.apply();
    }

    public static MyPreferences getPreferences(Context context) {
        if (myPreferences == null) myPreferences = new MyPreferences(context);
        return myPreferences;
    }

    public void setUserEMAIL(String userEMAIL){
        editor.putString(Config.USER_EMAIL, userEMAIL);
        editor.apply();
    }
    public String getUserEMAIL(){
        return sharedPreferences.getString(Config.USER_EMAIL, "EMAIL not found");
    }

    public String getUserConfirmCode(){
        return sharedPreferences.getString(Config.CONFIRMCODE, "ConfirmCode not found");
    }

    public void setUserConfirmCode(String userConfirmCode){
        editor.putString(Config.CONFIRMCODE,userConfirmCode);
        editor.apply();
    }



    public void setPassword(String password){
        editor.putString(Config.PASSWORD, password);
        editor.apply();
    }

    public String getPassword(){
        return sharedPreferences.getString(Config.PASSWORD, "pass not found");
    }

    public String getCheckUserLogin() {
        return sharedPreferences.getString(Config.CHECKUSER, "user not found");
    }

    public void setCheckUserLogin(String checkUserLogin) {
        editor.putString(Config.CHECKUSER,checkUserLogin);
        editor.apply();
    }
}
