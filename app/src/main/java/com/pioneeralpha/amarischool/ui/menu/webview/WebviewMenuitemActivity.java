package com.pioneeralpha.amarischool.ui.menu.webview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.ui.home.HomePageActivity;
import com.pioneeralpha.amarischool.ui.menu.MenuFragment;
import com.pioneeralpha.amarischool.ui.menu.subscription.SubscriptionFragment;

public class WebviewMenuitemActivity extends AppCompatActivity {
    String itemName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_menuitem);
        Intent intent = getIntent();

        itemName = intent.getStringExtra("itemName");


        WebView mywebview = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //startActivity(new Intent(WebviewMenuitemActivity.this, HomePageActivity.class));

        if (itemName.equals("")){
            //startActivity(new Intent(WebviewMenuitemActivity.this, HomePageActivity.class));
        }



//        if (itemName.equals("linkedin")){
//            openLinkedin();
//        }else if(itemName.equals("youtube")){
//            openYoutube();
//            ///mywebview.loadUrl("https://www.youtube.com/AmariSchool");
//        }
//
//        else if(itemName.equals("tiktok")){
//            openTiktok();
//        }
//        else if(itemName.equals("fb")){
//            Intent facebookPageIntent = openFacebookPage(WebviewMenuitemActivity.this);
//            startActivity(facebookPageIntent);
//
//        }
//        else if(itemName.equals("instra")){
//            Intent instraIntent = openInstragram(WebviewMenuitemActivity.this);
//            startActivity(instraIntent);
//
//        }
//        else if(itemName.equals("twitter")){
//            openTwitter();
//        }
        else if(itemName.equals("bug")){
//            String url="https://docs.google.com/forms/d/e/1FAIpQLScLkeBjnIRVXeSe0HU8px-u1wSQDz7RytCrBTiqzDl2blhVdw/viewform";
//            url=url.replaceAll(" ","%20");
//            String newUA= "Chrome/43.0.2357.65 ";
//            mywebview.getSettings().setUserAgentString(newUA);
//            mywebview.loadUrl("https://view.officeapps.live.com/op/view.aspx?src="+url);
//            //mywebview.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScLkeBjnIRVXeSe0HU8px-u1wSQDz7RytCrBTiqzDl2blhVdw/viewform");
        }

        else if(itemName.equals("mockinterview")){
            mywebview.loadUrl("https://www.development.amarischool.com/mock-interview-form");
        }else if(itemName.equals("certificateVerify")){
            mywebview.loadUrl("https://www.development.amarischool.com/verify-certificate");
        }else if(itemName.equals("termsofuse")){
            mywebview.loadUrl("https://www.development.amarischool.com/terms-and-conditions");
        }
        else if(itemName.equals("privacypolicy")){
            mywebview.loadUrl("https://www.development.amarischool.com/privacy-policy");
        }
        else if(itemName.equals("joinus")){
            mywebview.loadUrl("https://join.amarischool.com/");
        }
        else if(itemName.equals("affiliate")){
            mywebview.loadUrl("https://join.amarischool.com/affiliate");
        }
        else if(itemName.equals("blog")){
            mywebview.loadUrl("https://blog.amarischool.com/");
        }
        else if(itemName.equals("suggestcourse")){
            mywebview.loadUrl("https://www.development.amarischool.com/suggest-course-form");
        }
        else if(itemName.equals("webinar")){

            mywebview.loadUrl("https://development.amarischool.com/webinar");
        }
        else if(itemName.equals("contactus")){

            mywebview.loadUrl("https://www.development.amarischool.com/contactus");
        }
        else if(itemName.equals("successstory")){

            mywebview.loadUrl("https://www.development.amarischool.com/successstory");
        }
        else if(itemName.equals("aboutus")){
            mywebview.loadUrl("https://www.development.amarischool.com/aboutus");
        }
        else if(itemName.equals("faq")){
            mywebview.loadUrl("https://www.development.amarischool.com/faq");
        }
        else if(itemName.equals("mentor")){
            mywebview.loadUrl("https://www.development.amarischool.com/mentoring-form");
        }
        else {
            startActivity(new Intent(WebviewMenuitemActivity.this, HomePageActivity.class));
            //Toast.makeText(this, ""+itemName, Toast.LENGTH_SHORT).show();
        }
        //startActivity(new Intent(WebviewMenuitemActivity.this, HomePageActivity.class));
        //mywebview.setWebViewClient(new WebViewClient());



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(itemName.equals("bug")){
            Intent startMapIntent = new Intent(this,HomePageActivity.class);

            startActivity(startMapIntent);
        }
    }
}