package com.codingwithbrothers.interfaces.impl;

import com.codingwithbrothers.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with Rocket");
    }
}
