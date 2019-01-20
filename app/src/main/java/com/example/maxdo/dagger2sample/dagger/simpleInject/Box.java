package com.example.maxdo.dagger2sample.dagger.simpleInject;

import javax.inject.Inject;

public class Box {
    @Inject
    Box() {x = -1; y = -1;}

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}