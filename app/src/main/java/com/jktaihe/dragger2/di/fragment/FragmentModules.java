package com.jktaihe.dragger2.di.fragment;

import android.support.v4.app.Fragment;
import com.jktaihe.dragger2.fragment.Fragment1;
import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by jktaihe on 29/4/17.
 * blog: blog.jktaihe.com
 */
@Module(subcomponents = FragmentSubComponet.class)
public abstract class FragmentModules {
    @Binds
    @IntoMap
    @FragmentKey(Fragment1.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindFragment1InjectorFactory(FragmentSubComponet.Builder builder);

}
