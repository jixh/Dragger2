package com.jktaihe.dragger2.di;

import com.jktaihe.dragger2.AppApplication;
import com.jktaihe.dragger2.di.main.way2.MainModules;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by jktaihe on 8/9/17.
 * blog: blog.jktaihe.com
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AppModule.class,
        MainModules.class
//        ,
//        ContributesAndroidModule.class,
})
public interface AppComponent extends AndroidInjector<AppApplication> {
    void inject(AppApplication appApplication);
}
