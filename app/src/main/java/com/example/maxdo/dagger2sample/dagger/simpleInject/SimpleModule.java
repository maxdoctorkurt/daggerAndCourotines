package com.example.maxdo.dagger2sample.dagger.simpleInject;

import dagger.Module;
import dagger.Provides;

@Module
public class SimpleModule {

    @Provides
    Box getBigBox() {
        Box result = new Box();
        result.setX(100);
        result.setY(100);
        return result;
    }

//    @Provides
//    Box getSmallBox() {
//        Box result = new Box();
//        result.setX(10);
//        result.setY(10);
//        return result;
//    }

}
