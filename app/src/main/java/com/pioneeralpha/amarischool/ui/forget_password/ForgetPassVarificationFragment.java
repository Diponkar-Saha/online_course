package com.pioneeralpha.amarischool.ui.forget_password;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.FragmentForgetPassNewPassInputBinding;
import com.pioneeralpha.amarischool.databinding.FragmentForgetPassVarificationBinding;
import com.pioneeralpha.amarischool.utils.MyPreferences;


public class ForgetPassVarificationFragment extends Fragment {

    private FragmentForgetPassVarificationBinding binding;
    private MyPreferences myPreferences;
    private ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentForgetPassVarificationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        viewPager = getActivity().findViewById(R.id.forget_pass_viewpager);
        myPreferences = MyPreferences.getPreferences(requireContext());
        Log.e("forgotpass l", "email test");



        binding.sendConfirmCodeBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1= binding.inputCode1EditText.getText().toString();
                String p2= binding.inputCode2EditText.getText().toString();
                String p3= binding.inputCode3EditText.getText().toString();
                String p4= binding.inputCode4EditText.getText().toString();
                String p5= binding.inputCode5EditText.getText().toString();
                String p6= binding.inputCode6EditText.getText().toString();
                if (p1.isEmpty()){
                    binding.inputCode1EditText.setError("Enter Verification Code");
                    binding.inputCode1EditText.requestFocus();
                }
                if (p2.isEmpty()){
                    binding.inputCode2EditText.setError("Enter Verification Code");
                    binding.inputCode2EditText.requestFocus();
                }
                if (p3.isEmpty()){
                    binding.inputCode3EditText.setError("Enter Verification Code");
                    binding.inputCode3EditText.requestFocus();
                }
                if (p4.isEmpty()){
                    binding.inputCode4EditText.setError("Enter Verification Code");
                    binding.inputCode4EditText.requestFocus();
                }
                if (p5.isEmpty()){
                    binding.inputCode5EditText.setError("Enter Verification Code");
                    binding.inputCode5EditText.requestFocus();
                }
                if (p6.isEmpty()){
                    binding.inputCode6EditText.setError("Enter Verification Code");
                    binding.inputCode6EditText.requestFocus();
                }
                String pass = p1+p2+p3+p4+p5+p6;


                myPreferences.setUserConfirmCode(pass);
                Log.e("forgotpass", "con code"+pass);
                Log.e("forgotpass", "con code"+myPreferences.getUserConfirmCode());
               viewPager.setCurrentItem(2);




            }
        });



        return root;
    }
}