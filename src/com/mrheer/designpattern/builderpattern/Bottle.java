package com.mrheer.designpattern.builderpattern;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
