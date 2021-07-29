package com.vaibhavmojidra.dagger2fieldinjectionjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject SmartPhone smartPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerSmartPhoneComponent.create().inject(this);// Injecting via dagger 2
        smartPhone.startCallRecording();
    }
}