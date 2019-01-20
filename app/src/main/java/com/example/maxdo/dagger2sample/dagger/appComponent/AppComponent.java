package com.example.maxdo.dagger2sample.dagger.appComponent;

import com.example.maxdo.dagger2sample.App;
import dagger.Component;

@Component(modules = {
        ContextModule.class,
        InterceptorModule.class,
        OkHttpClientModule.class,
        RetrofitModule.class,
        PreferencesModule.class})
public interface AppComponent {
    void inject(App app);
}
