package com.example.apple.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SayhiFragment extends Fragment {

    final static String LAYOUT_ID = "layoutId";


    public SayhiFragment() {

        // Required empty public constructor
    }

    public static SayhiFragment newInstance(int layoutId) {



        SayhiFragment fragment = new SayhiFragment();
        Bundle args = new Bundle();
        args.putInt(LAYOUT_ID, layoutId);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(getArguments().getInt(LAYOUT_ID, -1),container,false);
        return root;
    }

}
