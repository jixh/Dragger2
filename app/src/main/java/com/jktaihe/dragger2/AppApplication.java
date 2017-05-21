package com.jktaihe.dragger2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jktaihe.dragger2.newbean.Test;

import javax.inject.Inject;
import javax.inject.Singleton;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by jktaihe on 29/4/17.
 * blog: blog.jktaihe.com
 */

public class AppApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    @Singleton
    @Component(modules = {ApplicationModule.class,AndroidInjectionModule.class,MainModules.class})
    public interface ApplicationComponent{
        void inject(AppApplication application);
//        Application application();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppApplication_ApplicationComponent
                .builder()
                .build()
                .inject(this);
    }
}
