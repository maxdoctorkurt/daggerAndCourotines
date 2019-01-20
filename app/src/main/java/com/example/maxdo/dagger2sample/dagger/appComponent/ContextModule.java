package com.example.maxdo.dagger2sample.dagger.appComponent;


import android.content.Context;
import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;
import javax.inject.Singleton;

@Module
public class ContextModule {

    private Context context;

    @Inject
    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
//    @Singleton
    Context getContext() {
        return context;
    }

}
