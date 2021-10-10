package com.example.android.lx_criminalintent;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract class SingleFragmentActivity extends AppCompatActivity {
    // this abstract class aim to remove duplicate code,
    // of the instantiation of Fragment class

    // this generic superclass can be inherited by activity to help instantiate fragments

    // abstract method
    // subclass will use createFragment to create the desired Fragment
    // e.g. CrimeFragment(), or CrimeListFragment()
    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        // get reference of FragmentManager in this activity
        FragmentManager fm = getSupportFragmentManager();

        // get reference of CrimeFragment
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = createFragment();
            // Create a new fragment transaction,
            // include one add operation in it, and then commit it
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
