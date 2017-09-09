package com.jktaihe.dragger2.di;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.jktaihe.dragger2.AppApplication;

import dagger.android.AndroidInjection;

/**
 * Created by jktaihe on 9/9/17.
 * blog: blog.jktaihe.com
 */

public class AndroidInject {

    private AndroidInject(){}

    public static void inject(AppApplication appApplication){

        DaggerAppComponent.create().inject(appApplication);


        appApplication.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                handleActivityInject(activity);
            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });

    }

    private static void handleActivityInject(Activity activity) {
        AndroidInjection.inject(activity);
    }
}
