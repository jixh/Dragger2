package com.jktaihe.dragger2;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.jktaihe.dragger2.base.DaggerFragmentActivity;
import com.jktaihe.dragger2.fragment.Fragment1;
import com.jktaihe.dragger2.fragment.Fragment2;
import com.jktaihe.dragger2.utils.AppUtil;
import com.jktaihe.dragger2.utils.BottomNavigationUtil;

public class MainActivity extends DaggerFragmentActivity {


    Class<? extends Fragment>[] classes = new Class[]{Fragment1.class, Fragment2.class};

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

    }

    private void setView(int i) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        Fragment fragment = AppUtil.newInstance(classes[i]);

        fragmentTransaction.replace(R.id.fl_content,fragment).commitAllowingStateLoss();

    }




}
