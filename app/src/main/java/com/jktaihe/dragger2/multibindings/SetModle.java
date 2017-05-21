package com.jktaihe.dragger2.multibindings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;

/**
 * Created by jktaihe on 4/5/17.
 * blog: blog.jktaihe.com
 */
@Module
public class SetModle {

    @Provides @IntoSet
    static String getStr(M m, D d){
        return "str+"+m.getClass().getSimpleName()+"+"+d.getClass().getSimpleName();
    }

    @Provides @ElementsIntoSet
    static Set<String> getStrs(M m, D d){
        return new HashSet<>(Arrays.asList(m.getClass().getSimpleName(),d.getClass().getSimpleName()));
    }



}
