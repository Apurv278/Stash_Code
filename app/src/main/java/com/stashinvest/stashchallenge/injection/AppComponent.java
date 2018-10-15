package com.stashinvest.stashchallenge.injection;


import com.stashinvest.stashchallenge.ui.HomeActivity;
import com.stashinvest.stashchallenge.networking.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {NetworkModule.class,})
public interface AppComponent {
    void inject(HomeActivity homeActivity);
}
