package com.iho.app.Database.DisplayDataFromDB;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iho.app.Database.Columns;
import com.iho.app.R;


public class PerTravelViewFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(
                R.layout.per_travel, container, false);
        TextView textView = (TextView) v.findViewById(R.id.title);
        Intent i = getActivity().getIntent();
        textView.setText(i.getStringExtra(Columns.KEY_TRAVEL_TEXT.getColumnName()));
        return v;
    }

    @Override
    public void onStart(){
        super.onStart();
    }

}