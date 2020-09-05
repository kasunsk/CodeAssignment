package com.code.assignment.animal.bird;

public class Parrot extends Bird {

    private String speak;

    @Override
    public void sing() {
        System.out.println(speak);
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
}
