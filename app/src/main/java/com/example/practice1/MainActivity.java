package com.example.practice1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.practice1.adapter.Tablayoutadapter;
import com.example.practice1.model.NewModel;
import com.google.android.material.tabs.TabLayout;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadTablayout();


    }// onCreate end here----------------

    private void loadTablayout(){
        List<NewModel> tabs = Arrays.asList(
                new NewModel("Home", "Welcome to Home Page", R.drawable.image1),
                new NewModel("About", "This is About Page", R.drawable.image2),
                new NewModel("Services", "We provide the best services", R.drawable.image3),
                new NewModel("Gallery", "Here are some pictures", R.drawable.image4),
                new NewModel("Contact", "Reach us anytime", R.drawable.image6)

        );

        TabLayout tablayout = findViewById(R.id.tablayout);
        ViewPager2 viewpager2 = findViewById(R.id.viewpager2);

        for (NewModel tab : tabs){
            tablayout.addTab(tablayout.newTab().setText(tab.getTitle()));
        }

        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewpager2.setCurrentItem(tab.getPosition());


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewpager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tablayout.selectTab(tablayout.getTabAt(position));
            }
        });

        Tablayoutadapter tablayoutadapter = new Tablayoutadapter(this,tabs);
        viewpager2.setAdapter(tablayoutadapter);

    }// mathod end here--------------------------
}