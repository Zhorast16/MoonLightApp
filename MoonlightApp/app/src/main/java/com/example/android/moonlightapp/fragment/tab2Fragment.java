package com.example.android.moonlightapp.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.moonlightapp.R;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class tab2Fragment extends android.support.v4.app.Fragment {


    public tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab2, container, false);
        Bundle args = getArguments();
        myClass = myClass = (tab1Fragment.MyClass) args
                .getSerializable(TAG_MY_CLASS);
    }

}
