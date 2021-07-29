package com.vaibhavmojidra.dagger2fieldinjectionjava;

import android.util.Log;

import javax.inject.Inject;

public class Battery {
    @Inject
    public Battery() {
    }

    protected void getPowerAvailability(){
        Log.i("MyInfo","Power is available");
    }
}
