package com.example.maxdo.dagger2sample.dagger.simpleInject;

import dagger.Component;

@Component(modules = SimpleModule.class)

public interface SimpleInjectComponent {
    Box getBox();
    BoxCalc getBoxCalc();
}
