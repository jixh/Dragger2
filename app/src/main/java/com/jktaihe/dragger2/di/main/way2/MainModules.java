package com.jktaihe.dragger2.di.main.way2;

import android.app.Activity;

import com.jktaihe.dragger2.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by jktaihe on 29/4/17.
 * blog: blog.jktaihe.com
 */
@Module(subcomponents = MainSubComponet.class)
public abstract class MainModules {

//    public MainModules(Activity activity){
//        this.activity = activity;
//    }
//
//    Activity activity;
//
//
//    @Provides public Activity activity(){
//        return activity;
//    }


    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainSubComponet.Builder builder);

}
