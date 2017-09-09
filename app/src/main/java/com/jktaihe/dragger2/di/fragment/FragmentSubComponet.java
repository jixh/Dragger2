package com.jktaihe.dragger2.di.fragment;

import com.jktaihe.dragger2.fragment.Fragment1;
import com.jktaihe.dragger2.newbean.ModuleTest;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by jktaihe on 1/5/17.
 * blog: blog.jktaihe.com
 */
@Subcomponent(modules = {ModuleTest.class})
public interface FragmentSubComponet extends AndroidInjector<Fragment1>{
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<Fragment1>{

    }
}
