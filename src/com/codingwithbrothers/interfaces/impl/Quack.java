package com.codingwithbrothers.interfaces.impl;

import com.codingwithbrothers.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
