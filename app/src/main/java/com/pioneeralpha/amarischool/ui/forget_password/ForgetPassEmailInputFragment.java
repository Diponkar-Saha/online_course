package com.pioneeralpha.amarischool.ui.forget_password;

import static com.amazonaws.mobile.auth.core.internal.util.ThreadUtils.runOnUiThread;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobile.client.Callback;
import com.amazonaws.mobile.client.results.ForgotPasswordResult;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.FragmentForgetPassEmailInputBinding;
import com.pioneeralpha.amarischool.utils.MyPreferences;


public class ForgetPassEmailInputFragment extends Fragment {

    private ViewPager viewPager;
    private MyPreferences myPreferences;

    private FragmentForgetPassEmailInputBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentForgetPassEmailInputBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        viewPager = getActivity().findViewById(R.id.forget_pass_viewpager);
        myPreferences = MyPreferences.getPreferences(requireContext());

        binding.sendConfirmCodeBtnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgotPassword();
            }
        });


        return root;

    }

    private void forgotPassword(){
        if(binding.txtEmail.getText().toString().isEmpty()){
            binding.txtEmail.setError("Email Required");
            binding.txtEmail.requestFocus();
            return;
        }
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (!binding.txtEmail.getText().toString().matches(emailPattern))
        {
            binding.txtEmail.setError("Enter Valid Email Address");
            binding.txtEmail.requestFocus();
            return;
        }
        AWSMobileClient.getInstance().forgotPassword(binding.txtEmail.getText().toString(), new Callback<ForgotPasswordResult>() {
            @Override
            public void onResult(final ForgotPasswordResult result) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //Log.d("ForgotPass", "forgot password state: " + result.getState());
                        switch (result.getState()) {
                            case CONFIRMATION_CODE:
                              myPreferences.setUserEMAIL(binding.txtEmail.getText().toString());
                              viewPager.setCurrentItem(1);

                                Toast.makeText(requireContext(), "Code sent", Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                Log.e("ForgotPass", "un-supported forgot password state");
                                break;
                        }
                    }
                });
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(requireContext(), "Email Incorrect", Toast.LENGTH_SHORT).show();
                Log.e("ForgotPass", "forgot password error", e);
            }
        });

    }

}