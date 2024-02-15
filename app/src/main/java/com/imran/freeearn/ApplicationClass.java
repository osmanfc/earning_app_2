package com.imran.freeearn;

import android.app.Application;

import com.onesignal.OneSignal;

public class ApplicationClass extends Application { ;

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(Constants.ONESiGNAL_APPID);
    }
}
