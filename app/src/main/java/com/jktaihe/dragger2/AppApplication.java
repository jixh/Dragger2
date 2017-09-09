package com.jktaihe.dragger2;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import com.jktaihe.dragger2.di.AndroidInject;
import javax.inject.Inject;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by jktaihe on 29/4/17.
 * blog: blog.jktaihe.com
 */

public class AppApplication extends Application implements HasActivityInjector{

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        AndroidInject.inject(this);
    }

//
//    @Inject
//    DispatchingAndroidInjector<Fragment> fragmentSupportInjector;
//
//    @Override
//    public AndroidInjector<Fragment> supportFragmentInjector() {
//        return fragmentSupportInjector;
//    }
//


}
