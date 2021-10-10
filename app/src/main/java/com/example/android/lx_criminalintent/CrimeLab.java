package com.example.android.lx_criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {
    // CrimeLab is the Singleton Class that will host the list of mCrimes

    // static variable, only one instance
    private static CrimeLab sCrimeLab;
    private final List<Crime> mCrimes;

    private CrimeLab(Context context) {
        // declaration specifies Crime as generic argument,
        // mCrimes ArrayList will contain Crimes
        mCrimes = new ArrayList<>();

        // populate mCrimes with fake data
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        // already loop over entire list, UUID not found
        return null;
    }

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

}
