package com.jktaihe.dragger2.qualifiers;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jktaihe on 9/9/17.
 * blog: blog.jktaihe.com
 */
@Module
public abstract class AppleBeanModule {
    @Tags("color")
    @Provides
    public static AppleBean provideColorApple() {
        return new AppleBean("red");
    }

    @Tags("name")
    @Provides
    public static AppleBean provideNameApple() {
        return new AppleBean("红富士", 6.88);
    }
}
