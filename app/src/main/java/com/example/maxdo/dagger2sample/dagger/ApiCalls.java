package com.example.maxdo.dagger2sample.dagger;

import com.example.maxdo.dagger2sample.dagger.appComponent.Api;
import retrofit2.Retrofit;
import javax.inject.Inject;

public class ApiCalls {

    private Api api;

    @Inject
    ApiCalls(Retrofit retrofit) {
        api = retrofit.create(Api.class);
    }

    Api getApi() {
        return api;
    }
}
