package com.jktaihe.dragger2.newbean;

import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;

/**
 * Created by jktaihe on 29/4/17.
 * blog: blog.jktaihe.com
 */
@Module
abstract class ModuleTest {
    @Provides
    static Testint provideTest(){
        return new Test();
    }

    @BindsOptionalOf abstract Testint provideTest2();
}
