package com.example.android.javafragmentmenu;



import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TextField extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_field,
                container, false);
        return view;
    }

    public void onClick(){
        Fragment newFragment = new Fragment();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        newFragment.equals(new Counter());

        transaction.replace(R.id.AppContent, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void showOtherFragment()
    {
        Fragment fr=new Fragment();
        fr.equals(new Counter());
        FragmentChangeListener fc=(FragmentChangeListener)getActivity();
        fc.replaceFragment(fr);
    }
}
