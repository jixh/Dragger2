package com.jktaihe.dragger2.di.main.way2;

import com.jktaihe.dragger2.MainActivity;
import com.jktaihe.dragger2.di.fragment.FragmentModules;
import com.jktaihe.dragger2.multibindings.SetModle;
import com.jktaihe.dragger2.qualifiers.AppleBeanModule;
import com.jktaihe.dragger2.scope.MyScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by jktaihe on 1/5/17.
 * blog: blog.jktaihe.com
 */
@MyScope
@Subcomponent(modules = {FragmentModules.class,AppleBeanModule.class, SetModle.class})
public interface MainSubComponet extends AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity>{

    }
}
