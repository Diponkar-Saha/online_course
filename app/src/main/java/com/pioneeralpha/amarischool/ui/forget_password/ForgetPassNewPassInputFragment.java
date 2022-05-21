package com.pioneeralpha.amarischool.ui.forget_password;

import static com.amazonaws.mobile.auth.core.internal.util.ThreadUtils.runOnUiThread;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobile.client.Callback;
import com.amazonaws.mobile.client.results.ForgotPasswordResult;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.FragmentForgetPassEmailInputBinding;
import com.pioneeralpha.amarischool.databinding.FragmentForgetPassNewPassInputBinding;
import com.pioneeralpha.amarischool.ui.login.LoginActivity;
import com.pioneeralpha.amarischool.utils.MyPreferences;


public class ForgetPassNewPassInputFragment extends Fragment {
    private FragmentForgetPassNewPassInputBinding binding;

    private MyPreferences myPreferences;
    private String confirmationCode ,email;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentForgetPassNewPassInputBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        myPreferences = MyPreferences.getPreferences(requireContext());



        binding.sendConfirmCodeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conpareCodeAndPass();

            }
        });

        return root;


    }

    private void conpareCodeAndPass() {
        confirmationCode = myPreferences.getUserConfirmCode();
        email = myPreferences.getUserEMAIL();

        Log.e("forgotpass l", "email"+email);
        Log.e("forgotpass l", "pass"+confirmationCode);

       String newPass= binding.txtnewPass.getText().toString();
       String conNewPass= binding.txtConfirmNewPass.getText().toString();
       if (newPass.isEmpty()){
           binding.txtnewPass.setError("Password required.");
           binding.txtnewPass.requestFocus();

       }

        if (conNewPass.isEmpty()){
            binding.txtConfirmNewPass.setError("Password required.");
            binding.txtConfirmNewPass.requestFocus();

        }
        if(!newPass.equals(conNewPass)){
            binding.txtConfirmNewPass.setError("Password doesn't match.");
            binding.txtConfirmNewPass.requestFocus();
            return;
        }

        AWSMobileClient.getInstance().confirmForgotPassword(email, newPass, confirmationCode, new Callback<ForgotPasswordResult>() {
            @Override
            public void onResult(final ForgotPasswordResult result) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //Log.d(TAG, "forgot password state: " + result.getState());
                        switch (result.getState()) {
                            case DONE:
                                myPreferences.setUserConfirmCode("");
                                myPreferences.setUserEMAIL("");

                                Toast.makeText(requireContext(), "Password changed successfully", Toast.LENGTH_SHORT).show();

                                Intent intent=new Intent(requireContext(), LoginActivity.class);
                                startActivity(intent);

                                break;
                            default:
                                Log.e("forgotpass", "un-supported forgot password state");
                                break;
                        }
                    }
                });
            }

            @Override
            public void onError(Exception e) {
                Log.e("forgotpass", "forgot password error", e);
                Toast.makeText(requireContext(), "Sorry.Please Try Again", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(requireContext(), ForgetPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}