package com.code.assignment.animal.bird;

public class Chicken extends Bird {

    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
