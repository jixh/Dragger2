package com.jktaihe.dragger2.newbean;

import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by jktaihe on 29/4/17.
 * blog: blog.jktaihe.com
 */
@Singleton
@Component
public interface CompontTest {

    Test makerBean();


    @Component.Builder
    interface Builder{
       @BindsInstance Builder username(String username);
        CompontTest build();
    }


}
