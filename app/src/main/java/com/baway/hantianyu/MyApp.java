package com.baway.hantianyu;

import android.app.Application;


public class MyApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
