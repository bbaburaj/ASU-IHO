package com.iho.app.Pages;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iho.app.R;


public class Gallery extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(
                R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
    }

}