package com.vaibhavmojidra.dagger2fieldinjectionjava;

import android.util.Log;

import javax.inject.Inject;

public class ServiceProvider {
    @Inject
    public ServiceProvider() {
    }

    protected void getServiceProvider(){
        Log.i("MyInfo","Got Service Provider");
    }
}
