package com.example.professt.draggerpractise.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.professt.draggerpractise.R;

public abstract class BaseActivity extends AppCompatActivity {

    public void addFragmentToActivity (FragmentManager fragmentManager,
                                       Fragment fragment,
                                       int frameId,
                                       String tag) {

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(frameId, fragment, tag);
        transaction.commit();
    }
}
