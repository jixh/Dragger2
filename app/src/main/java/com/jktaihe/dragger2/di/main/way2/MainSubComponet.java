package com.jktaihe.dragger2.di.main.way2;

import com.jktaihe.dragger2.MainActivity;
import com.jktaihe.dragger2.di.fragment.FragmentModules;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by jktaihe on 1/5/17.
 * blog: blog.jktaihe.com
 */
@Subcomponent(modules = {FragmentModules.class})
public interface MainSubComponet extends AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity>{

    }
}
