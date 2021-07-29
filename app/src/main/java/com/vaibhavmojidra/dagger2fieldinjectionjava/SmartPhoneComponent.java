package com.vaibhavmojidra.dagger2fieldinjectionjava;

import dagger.Component;

@Component
public interface SmartPhoneComponent {
    void inject(MainActivity mainActivity);
}
