package com.jktaihe.dragger2;

import dagger.Component;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by jktaihe on 1/5/17.
 * blog: blog.jktaihe.com
 */
@Subcomponent
public interface MainSubComponet extends AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity>{

    }
}
