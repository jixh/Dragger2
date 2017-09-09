package com.jktaihe.dragger2.di.main.way1;

import com.jktaihe.dragger2.MainActivity;
import com.jktaihe.dragger2.di.fragment.FragmentModules;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by jktaihe on 1/5/17.
 * blog: blog.jktaihe.com
 */
@Module
public abstract class ContributesAndroidModule {
    @ContributesAndroidInjector(modules = {FragmentModules.class})
    abstract MainActivity contributeYourActivityInjector();
}
