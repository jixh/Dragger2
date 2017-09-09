package com.jktaihe.dragger2;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import javax.inject.Inject;

/**
 * Created by jktaihe on 1/5/17.
 * blog: blog.jktaihe.com
 */

public class ToastM<T extends Activity> {

    private T activity;

    @Inject
    public ToastM(T activity){
        this.activity = activity;
    }

    public void toastS(){
        Toast.makeText(activity, "this is test", Toast.LENGTH_SHORT).show();
    }
}
