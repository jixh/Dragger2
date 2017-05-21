package com.jktaihe.dragger2.qualifiers;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by jktaihe on 30/4/17.
 * blog: blog.jktaihe.com
 */

@Documented
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Tags {
    String value() default "";
}
