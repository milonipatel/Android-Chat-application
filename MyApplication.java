package com.sinch.messagingtutorial.app;

import android.app.Application;
import com.parse.Parse;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "EE5YXz1G2yRPXjncoXdxk7vBcZxmzkGf8x44COVc", "Ds1gxE5GZh8KuSjAig6CkTEcLTj5lZbptQfoT7Wa");
    }
}
