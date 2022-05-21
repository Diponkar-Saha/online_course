package com.pioneeralpha.amarischool.ui.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.amplifyframework.core.Amplify;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.SplashActivity;
import com.pioneeralpha.amarischool.WishlistFragment;
import com.pioneeralpha.amarischool.databinding.FragmentMenuBinding;
import com.pioneeralpha.amarischool.ui.dashboard.fragments.mypoints.MyPointsFragment;
import com.pioneeralpha.amarischool.ui.login.LoginActivity;
import com.pioneeralpha.amarischool.ui.menu.subscription.SubscriptionFragment;
import com.pioneeralpha.amarischool.ui.menu.webview.WebviewMenuitemActivity;
import com.pioneeralpha.amarischool.ui.profile.ProfileActivity;
import com.pioneeralpha.amarischool.ui.settings.SettingsActivity;
import com.pioneeralpha.amarischool.utils.MyPreferences;


public class MenuFragment extends Fragment {
    private FragmentMenuBinding mBinding;
    private MyPreferences myPreferences;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentMenuBinding.inflate(inflater, container, false);
        view = mBinding.getRoot();
        myPreferences = MyPreferences.getPreferences(requireContext());
        //successstory

        Toast.makeText(requireContext(), ""+myPreferences.getCheckUserLogin(), Toast.LENGTH_SHORT).show();
        if (myPreferences.getCheckUserLogin().equals("userlogin")){
            mBinding.signinBtn.setVisibility(View.GONE);

        }else {
            mBinding.logoutBtn.setVisibility(View.GONE);
        }

        mBinding.profile.setOnClickListener(v -> startActivity(new Intent(getActivity(), ProfileActivity.class)));

//        mBinding.enterpriseBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getActivity(), EnterpriseActivity.class));
//            }
//        });Log.i("AuthQuickstart", "Signed out successfully")
        mBinding.logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               logOut();
            }
        });

        mBinding.suggestcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
                startMapIntent.putExtra("itemName", "suggestcourse");
                startActivity(startMapIntent);
            }
        });

        mBinding.successStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
                startMapIntent.putExtra("itemName", "successstory");
                startActivity(startMapIntent);
            }
        });
        mBinding.subscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeFragment(new SubscriptionFragment());
            }
        });

        mBinding.mentor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
                startMapIntent.putExtra("itemName", "mentor");
                startActivity(startMapIntent);
            }
        });

        mBinding.mockinterview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
                startMapIntent.putExtra("itemName", "mockinterview");
                startActivity(startMapIntent);
            }
        });

        mBinding.certificateVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
                startMapIntent.putExtra("itemName", "certificateVerify");
                startActivity(startMapIntent);
            }
        });
        mBinding.termsofuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
                startMapIntent.putExtra("itemName", "termsofuse");
                startActivity(startMapIntent);
            }
        });

        mBinding.privacypolicy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
                startMapIntent.putExtra("itemName", "privacypolicy");
                startActivity(startMapIntent);
            }
        });

        mBinding.joinus.setOnClickListener(v -> {

            Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
            startMapIntent.putExtra("itemName", "joinus");
            startActivity(startMapIntent);
        });

        mBinding.affiliate.setOnClickListener(v -> {

            Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
            startMapIntent.putExtra("itemName", "affiliate");
            startActivity(startMapIntent);
        });

        mBinding.blog.setOnClickListener(v -> {

            Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
            startMapIntent.putExtra("itemName", "blog");
            startActivity(startMapIntent);
        });

        mBinding.webinar.setOnClickListener(v -> {

            Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
            startMapIntent.putExtra("itemName", "webinar");
            startActivity(startMapIntent);
        });

        mBinding.faq.setOnClickListener(v -> {

            Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
            startMapIntent.putExtra("itemName", "faq");
            startActivity(startMapIntent);
        });
        mBinding.contUsBtn.setOnClickListener(v -> {

            Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
            startMapIntent.putExtra("itemName", "contactus");
            startActivity(startMapIntent);
        });

        mBinding.network.fb.setOnClickListener(v -> {
            Intent facebookPageIntent = openFacebookPage(getActivity());
            startActivity(facebookPageIntent);
        });

        mBinding.network.youtube.setOnClickListener(v -> {
            openYoutube();
        });

        mBinding.network.instagram.setOnClickListener(v -> {

            Intent instraIntent = openInstragram(getActivity());
            startActivity(instraIntent);
        });
        mBinding.network.tiktok.setOnClickListener(v -> {

            openTiktok();
        });
        mBinding.network.fbfroup.setOnClickListener(v -> {

            Intent facebookPageIntent = openFacebookGroup(getActivity());
            startActivity(facebookPageIntent);
        });
        mBinding.network.twitter.setOnClickListener(v -> {
            openTwitter();
        });

        mBinding.network.linkedin.setOnClickListener(v -> {

            openLinkedin();
        });




        mBinding.aboutus.setOnClickListener(v -> {

            Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
            startMapIntent.putExtra("itemName", "aboutus");
            startActivity(startMapIntent);
        });

        mBinding.myPointsBtn.setOnClickListener(v -> changeFragment(new MyPointsFragment()));

        mBinding.myWishlistBtn.setOnClickListener(v -> changeFragment(new WishlistFragment()));

        mBinding.signinBtn.setOnClickListener(v -> {
            Intent startMapIntent = new Intent(getActivity(), LoginActivity.class);
            startMapIntent.putExtra("loginName","true1");
            startActivity(startMapIntent);
        });


        mBinding.settingsBtn.setOnClickListener(v -> goToSettingsActivity());


        return view;
    }

    private void logOut() {
        Amplify.Auth.signOut(
                () -> Toast.makeText(requireContext(), "Signed out successfully", Toast.LENGTH_SHORT).show(),
                error -> Log.e("AuthQuickstart", error.toString())
        );
        Intent startMapIntent = new Intent(getActivity(), SplashActivity.class);
        startActivity(startMapIntent);
        myPreferences.setCheckUserLogin("user not found");

    }

    private void initializeView(FragmentMenuBinding mBinding) {
        mBinding.settingsBtn.setOnClickListener(view -> {
            goToSettingsActivity();
        });
    }

    private void goToSettingsActivity() {
        startActivity(new Intent(getActivity(), SettingsActivity.class));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }

    public void changeFragment(Fragment fragment) {
        Fragment newFragment = fragment;
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    private void openLinkedin(){
        try {
            getActivity().getPackageManager().getPackageInfo("com.linkedin.android", 0);
            Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/amar-ischool"));
            startActivity(intent9);
        }catch (Exception e) {
            Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/amar-ischool"));
            startActivity(intent9);
        }

    }
    private void openTwitter(){
        try
        {
            getActivity().getPackageManager().getPackageInfo("com.twitter.android", 0);

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/amar_iSchool")));
        }
        catch (PackageManager.NameNotFoundException e)
        {
            // If Twitter app is not installed, start browser.
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/amar_iSchool")));
        }
    }

    private void openTiktok(){
        try{
            Intent intent = new Intent(Intent.ACTION_VIEW,  Uri.parse("https://www.tiktok.com/@amar.ischool"));
            startActivity(intent);
        }catch(ActivityNotFoundException e){
            Intent intent = new Intent(Intent.ACTION_VIEW,  Uri.parse("https://www.tiktok.com/@amar.ischool"));
            startActivity(intent);
        }
    }

    private void openYoutube(){
        try{
            Intent intent = new Intent(Intent.ACTION_VIEW,  Uri.parse("https://www.youtube.com/AmariSchool"));
            startActivity(intent);
        }catch(ActivityNotFoundException e){
            Intent intent = new Intent(Intent.ACTION_VIEW,  Uri.parse("https://www.youtube.com/AmariSchool"));
            startActivity(intent);
        }
    }

    public static Intent openFacebookPage(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/100124218015674"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/amarischool.pioneer"));
        }
    }


    public static Intent openFacebookGroup(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/amarischool"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/amarischool"));
        }
    }

    private Intent openInstragram(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.instagram.android", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/amar_ischool/"));
        }catch (Exception e){
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/amar_ischool/"));
        }
    }

}
