package com.example.jetnixx.secret;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.jetnixx.secret.adapters.ViewPagerProfileAdapter;
import com.example.jetnixx.secret.originalClass.RoundImage;
import com.example.jetnixx.secret.originalClass.SlidingTabLayout;

public class ProfileActivity extends AppCompatActivity {

    ImageView image_view_profile_image;
    RoundImage roundImage;
    ViewPager view_pager_profile;
    ViewPagerProfileAdapter viewPagerProfileAdapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"General","Account"};
    int NumberOfTabs =2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Adding the custom made Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // showing the HomeButton
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // making the profile image circled
        image_view_profile_image = (ImageView) findViewById(R.id.image_view_profile_image);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.profle_images);
        roundImage = new RoundImage(bitmap);
        image_view_profile_image.setImageDrawable(roundImage);

        // Getting View Pager
        viewPagerProfileAdapter = new ViewPagerProfileAdapter(getSupportFragmentManager(), Titles, NumberOfTabs);
        view_pager_profile = (ViewPager) findViewById(R.id.view_pager_profile);
        view_pager_profile.setAdapter(viewPagerProfileAdapter);

        // Adding Tabs
        tabs = (SlidingTabLayout) findViewById(R.id.profile_tabs);
        tabs.setDistributeEvenly(true);

        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);         // giving tabs lower border color
            }
        });

        tabs.setViewPager(view_pager_profile);              // setting adapter to tabs

        // showing the work of floating button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tabs postion", String.valueOf(tabs.getVerticalScrollbarPosition()));
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
