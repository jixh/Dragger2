package com.jktaihe.dragger2.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import dagger.releasablereferences.CanReleaseReferences;

/**
 * Created by jktaihe on 30/4/17.
 * blog: blog.jktaihe.com
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@CanReleaseReferences
@Scope
public @interface MyScope {
}
