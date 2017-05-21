package com.jktaihe.dragger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import com.jktaihe.dragger2.multibindings.DaggerMapComponent;

import java.util.Map;
import javax.inject.Inject;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    ToastM<MainActivity> toastM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastM.toastS();

        AppCompatTextView tv = (AppCompatTextView) findViewById(R.id.tv);


//        Set<String> str = DaggerMcomponet.create().getStr();
//        str.add(DaggerMcomponet.create().getStr());


        Map<String,Long> map = DaggerMapComponent.create().getMap();

        tv.setText("map="+map.get("map"));


    }



}
