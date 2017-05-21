package com.jktaihe.dragger2.multibindings;

import java.util.Map;

import dagger.Component;

/**
 * Created by jktaihe on 4/5/17.
 * blog: blog.jktaihe.com
 */
@Component(modules = MapModle.class)
public interface MapComponent {
    Map<String,Long> getMap();
    Map<Class<?>,String> getM();
}
