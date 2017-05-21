package com.jktaihe.dragger2.multibindings;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

/**
 * Created by jktaihe on 4/5/17.
 * blog: blog.jktaihe.com
 */
@Module
public class MapModle {

    @Provides @IntoMap @StringKey("map")
    static Long providesMap(){
        return 100l;
    }

    @Provides @IntoMap @ClassKey(D.class)
    static String providerMap (){
        return "map";
    }
}
