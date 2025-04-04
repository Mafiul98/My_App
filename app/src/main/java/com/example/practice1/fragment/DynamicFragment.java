package com.example.practice1.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practice1.R;

import java.util.ArrayList;


public class DynamicFragment extends Fragment {

    private static final String ARG_TITLE = "title";
    private static final String ARG_CONTENT = "content";
    private static final String ARG_IMAGE_RES_ID = "image_res_id";

    private String title;
    private String content;
    private int imageResId;

    public static DynamicFragment newInstance(String title, String content, int imageResId) {
        DynamicFragment fragment = new DynamicFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        args.putString(ARG_CONTENT, content);
        args.putInt(ARG_IMAGE_RES_ID, imageResId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(ARG_TITLE);
            content = getArguments().getString(ARG_CONTENT);
            imageResId = getArguments().getInt(ARG_IMAGE_RES_ID);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dynamic, container, false);

        TextView text1 = view.findViewById(R.id.text1);
        TextView textcontent = view.findViewById(R.id.textContent);
        ImageView imageView = view.findViewById(R.id.imageview);

        text1.setText(title);
        textcontent.setText(content);
        imageView.setImageResource(imageResId);

        return view;
    }
}