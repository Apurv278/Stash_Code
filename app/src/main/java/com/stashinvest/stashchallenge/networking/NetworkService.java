package com.stashinvest.stashchallenge.networking;


import com.stashinvest.stashchallenge.models.CityListResponse;

import retrofit2.http.GET;
import rx.Observable;

public interface NetworkService {

    @GET("v1/city")
    Observable<CityListResponse> getCityList();

}
