package com.example.maxdo.dagger2sample.dagger.appComponent;

import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import okhttp3.Interceptor;
import okhttp3.Response;
import java.io.IOException;

@Module
public class InterceptorModule {
    @Provides
    Interceptor getInterceptor() {
        return new Interceptor() {

            @NonNull
            @Override
            public Response intercept(@NonNull Chain chain) throws IOException {
                return chain.proceed(chain.request());
            }
        };
    }
}
