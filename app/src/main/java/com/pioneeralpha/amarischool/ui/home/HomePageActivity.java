package com.pioneeralpha.amarischool.ui.home;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.ActivityHomePageBinding;
import com.pioneeralpha.amarischool.ui.cart.CartFragment;
import com.pioneeralpha.amarischool.ui.explore.ExploreFragment;
import com.pioneeralpha.amarischool.ui.menu.MenuFragment;
import com.pioneeralpha.amarischool.ui.menu.webview.WebviewMenuitemActivity;
import com.pioneeralpha.amarischool.ui.mycourses.MyCoursesFragment;

/**
 * The activity contains the fragment container that holds the following fragments:
 * -> Home
 * -> Explore
 * -> My Courses
 * -> Cart
 * -> Menu
 */
public class HomePageActivity extends AppCompatActivity implements HomeFragment.HomeFragmentListener
{

    private ActivityHomePageBinding mBinding;
    private final static int VIEW_TYPE_LIST = 1;
    private final static int VIEW_TYPE_GRID = 0;
    String mUsername = "Rick Sanchez";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityHomePageBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        setSupportActionBar(mBinding.toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        String blueString= "<font color='#0000FF'><u><b>Here!</b></u></font>";
        String blackString = "<font color='#000000'>Beta version of our app. If you submit more than 30 bugs, you can join any of our courses without payment;report your bug </font>";
        //test.setText(Html.fromHtml(redString + blackString));
        //Beta version of our app. If you submit more than 30 bugs, you can join any of our courses without payment;report your bug "
        mBinding.containerBugLayout.coursesMoreButton.setText(fromHtml(blackString+blueString));
        mBinding.containerBugLayout.coursesMoreButton.setOnClickListener(v -> {
//            Intent startMapIntent = new Intent(this, WebviewMenuitemActivity.class);
//            startMapIntent.putExtra("itemName", "bug");
//            startActivity(startMapIntent);
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScLkeBjnIRVXeSe0HU8px-u1wSQDz7RytCrBTiqzDl2blhVdw/viewform"));
                startActivity(intent);
            }catch (ActivityNotFoundException ex){
                Toast.makeText(this, "Can't open URL. Did you enter a valid URL", Toast.LENGTH_LONG).show();
            }

        });

//        BottomNavigationView navView = findViewById(R.id.nav_view);
//
//        NavController navController = Navigation.findNavController(this, R.id.fragment_container);
//
//        NavigationUI.setupWithNavController(mBinding.bottomNavigation, navController);

        getSupportFragmentManager().beginTransaction().replace(mBinding.fragmentContainer.getId(),
                new HomeFragment(VIEW_TYPE_LIST, mUsername)).commit();
                //new HomePageFragment()).commit();

        mBinding.bottomNavigation.setOnNavigationItemSelectedListener(item -> {
            Fragment selected;
            int id = item.getItemId();
            if (id == R.id.nav_home) {
                selected = new HomeFragment(VIEW_TYPE_LIST, mUsername);

            }
//            if (id == R.id.homePageFragment) {
//                selected = new HomePageFragment();
//
//            }

            else if (id == R.id.nav_explore) {
                selected = new ExploreFragment();

            } else if (id == R.id.nav_my_courses) {
                selected = new MyCoursesFragment();

            } else if (id == R.id.nav_cart) {
                selected = new CartFragment();

            } else {
                selected = new MenuFragment();
            }
            getSupportFragmentManager().beginTransaction().replace(mBinding.fragmentContainer.getId(),
                    selected).commit();
            return true;

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        // return true so that the menu pop up is opened
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_notification) {
            Toast.makeText(this, "notification clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
//        else if (item.getItemId() == R.id.menu_switch) {
//            Toast.makeText(this, "menu switch", Toast.LENGTH_SHORT).show();
//            return true;
//        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSwitchViewStyle(int viewStyle) {
        System.out.println("view style: " + viewStyle);
        Fragment currentFragment = getSupportFragmentManager().findFragmentById(mBinding.fragmentContainer.getId());
        if (currentFragment instanceof HomeFragment) {
          /*  FragmentTransaction fragTransaction = getSupportFragmentManager().beginTransaction();
            fragTransaction.detach(currentFragment);*/
            getSupportFragmentManager().beginTransaction().replace(mBinding.fragmentContainer.getId(),
                    new HomeFragment(viewStyle, mUsername)).commit();
        }

    }
    public static Spanned fromHtml(String source) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return Html.fromHtml(source, Html.FROM_HTML_MODE_LEGACY);
        } else {
            return Html.fromHtml(source);
        }
    }
}