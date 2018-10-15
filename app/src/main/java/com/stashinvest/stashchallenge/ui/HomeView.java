package com.stashinvest.stashchallenge.ui;

import com.stashinvest.stashchallenge.models.CityListResponse;

public interface HomeView {
    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getCityListSuccess(CityListResponse cityListResponse);

}
