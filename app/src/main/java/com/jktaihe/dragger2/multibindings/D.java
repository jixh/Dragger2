package com.jktaihe.dragger2.multibindings;

import javax.inject.Inject;

/**
 * Created by jktaihe on 4/5/17.
 * blog: blog.jktaihe.com
 */

public class D {
    @Inject D(){}

    String print(){
        return D.class.getSimpleName();
    }
}
