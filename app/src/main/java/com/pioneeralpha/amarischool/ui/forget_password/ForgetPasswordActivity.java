package com.pioneeralpha.amarischool.ui.forget_password;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.pioneeralpha.amarischool.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class ForgetPasswordActivity extends AppCompatActivity {
ViewPager viewPager;
DotsIndicator dotsIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        viewPager=findViewById(R.id.forget_pass_viewpager);
        ForgetPasswordFragmentPageAdapter fpAdapter=new ForgetPasswordFragmentPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fpAdapter);

        dotsIndicator = (DotsIndicator) findViewById(R.id.dots_indicator);
        dotsIndicator.setViewPager(viewPager);
    }
}