package com.example.maxdo.dagger2sample.dagger.simpleInject;

import javax.inject.Inject;

public class BoxCalc {

    private Box box;

    @Inject
    BoxCalc (Box box) {
        this.box = box;
    }

    public int calc() {
        return box.getX() * box.getY();
    }
}
