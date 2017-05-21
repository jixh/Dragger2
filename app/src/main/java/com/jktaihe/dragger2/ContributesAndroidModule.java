package com.jktaihe.dragger2;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by jktaihe on 1/5/17.
 * blog: blog.jktaihe.com
 */
@Module
public abstract class ContributesAndroidModule {
    @ContributesAndroidInjector//(modules = { /* modules to install into the subcomponent */ })
    abstract MainActivity contributeYourActivityInjector();
}
