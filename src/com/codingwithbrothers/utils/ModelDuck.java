package com.codingwithbrothers.utils;

import com.codingwithbrothers.interfaces.Duck;
import com.codingwithbrothers.interfaces.impl.FlyNoWay;
import com.codingwithbrothers.interfaces.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Model Duck");
    }
}
