package com.android.weather.util;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by Mr.bobo on 2017/6/30.
 */

public class MyApplication extends Application {
    private  static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
        LitePal.initialize(context);
    }

    public static Context getContext() {
        return context;
    }
}
