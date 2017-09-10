package com.jktaihe.dragger2;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import com.jktaihe.dragger2.base.DaggerFragmentActivity;
import com.jktaihe.dragger2.fragment.Fragment1;
import com.jktaihe.dragger2.fragment.Fragment2;
import com.jktaihe.dragger2.qualifiers.AppleBean;
import com.jktaihe.dragger2.qualifiers.Tags;
import com.jktaihe.dragger2.scope.BananaBean;
import com.jktaihe.dragger2.scope.OrangeBean;
import com.jktaihe.dragger2.utils.AppUtil;
import com.jktaihe.dragger2.utils.BottomNavigationUtil;

import java.util.Set;

import javax.inject.Inject;
import javax.inject.Provider;
import dagger.Lazy;

public class MainActivity extends DaggerFragmentActivity {


    @Inject
    Set<String> sets;

    @Tags("color")
    @Inject
    AppleBean appleColorBean;
    @Tags("name")
    @Inject
    AppleBean appleNameBean;


    @Inject
    OrangeBean orangeBean;
    @Inject
    OrangeBean orangeBean1;

    @Inject
    Lazy<BananaBean> bananaBean;
    @Inject
    Provider<BananaBean> bananaBean1;



    Class<? extends Fragment>[] classes = new Class[]{Fragment1.class, Fragment2.class};

    @Inject
    ToastM<MainActivity> toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnv = findViewById(R.id.bnv);
        BottomNavigationUtil.disableShiftMode(bnv);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.tab1:
                        setView(0);
                        break;
                    case R.id.tab2:
                        setView(1);
                        break;
                }
                return true;
            }
        });

        setView(0);

//        toast.toastS("appleColorBean"+appleColorBean.toString()+"\n"+"appleNameBean"+appleNameBean.toString());


        Log.i(MainActivity.class.getSimpleName(),orangeBean.toString()+","+orangeBean1.toString());
        Log.i(MainActivity.class.getSimpleName(),bananaBean.get().toString()+","+bananaBean.get().toString());
        Log.i(MainActivity.class.getSimpleName(),bananaBean1.get().toString()+","+bananaBean1.get().toString());
        Log.i(MainActivity.class.getSimpleName(),appleColorBean.toString()+","+appleNameBean.toString());
        Log.i(MainActivity.class.getSimpleName(),""+sets.size()+"set(1)=");

    }

    private void setView(int i) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        Fragment fragment = AppUtil.newInstance(classes[i]);

        fragmentTransaction.replace(R.id.fl_content,fragment).commitAllowingStateLoss();

    }




}
