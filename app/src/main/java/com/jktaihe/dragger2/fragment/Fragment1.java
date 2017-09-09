package com.jktaihe.dragger2.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.jktaihe.dragger2.newbean.Test;
import javax.inject.Inject;
import dagger.android.support.AndroidSupportInjection;


/**
 * Created by jktaihe on 9/9/17.
 * blog: blog.jktaihe.com
 */

public class Fragment1 extends Fragment {

    @Inject
    Test test;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView tv = new TextView(container.getContext());
        tv.setText("Fragment1");
        return tv;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        test.toString();
    }


    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
