package com.example.android.lx_criminalintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

public class CrimeActivity extends AppCompatActivity {

    private static final String TAG = "xiao.CRIME ACTIVITY =😁";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate: 1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        // get reference of FragmentManager in this activity
        FragmentManager fm = getSupportFragmentManager();

        // get reference of CrimeFragment
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new CrimeFragment();
            // Create a new fragment transaction,
            // include one add operation in it, and then commit it
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: 3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: 4");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: 5");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 6");
    }


}