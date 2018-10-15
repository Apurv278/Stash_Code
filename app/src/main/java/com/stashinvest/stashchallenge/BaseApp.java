package com.stashinvest.stashchallenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.stashinvest.stashchallenge.injection.DaggerAppComponent;
import com.stashinvest.stashchallenge.injection.AppComponent;
import com.stashinvest.stashchallenge.networking.NetworkModule;

import java.io.File;

public class BaseApp  extends AppCompatActivity{
    AppComponent appComponent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");
        appComponent = DaggerAppComponent.builder().networkModule(new NetworkModule(cacheFile)).build();

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
