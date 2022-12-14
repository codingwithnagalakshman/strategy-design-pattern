package com.codingwithbrothers.utils;

import com.codingwithbrothers.interfaces.Duck;
import com.codingwithbrothers.interfaces.impl.FlyWithWings;
import com.codingwithbrothers.interfaces.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
