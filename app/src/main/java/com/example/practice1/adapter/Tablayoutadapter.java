package com.example.practice1.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.practice1.fragment.DynamicFragment;
import com.example.practice1.model.NewModel;

import java.util.List;

public class Tablayoutadapter extends FragmentStateAdapter {

    private final List<NewModel> tabs;
    public Tablayoutadapter(@NonNull FragmentActivity fragmentActivity,List<NewModel> tabs) {
        super(fragmentActivity);
        this.tabs = tabs;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return DynamicFragment.newInstance(
                tabs.get(position).getTitle(),
                tabs.get(position).getContent(),
                tabs.get(position).getImageResId()
        );
      
    }

    @Override
    public int getItemCount() {
        return tabs.size();
    }
}
