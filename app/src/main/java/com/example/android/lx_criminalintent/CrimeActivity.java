package com.example.android.lx_criminalintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

public class CrimeActivity extends SingleFragmentActivity {

    private static final String TAG = "xiao.CRIME ACTIVITY =😁";

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

// below are lifecycle logs

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