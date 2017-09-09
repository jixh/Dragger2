package com.jktaihe.dragger2.di;

import android.app.Application;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jktaihe on 1/5/17.
 * blog: blog.jktaihe.com
 */
@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application){
        this.application = application;
    }


    @Provides @Singleton Application application(){
        return application;
    }
}
