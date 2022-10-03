package com.codingwithbrothers.interfaces.impl;

import com.codingwithbrothers.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
