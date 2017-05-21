package com.jktaihe.dragger2.multibindings;

import java.util.Set;

import dagger.Component;

/**
 * Created by jktaihe on 4/5/17.
 * blog: blog.jktaihe.com
 */
@Component(modules = SetModle.class)
public interface SetComponent {
    Set<String> getStrs();
}
