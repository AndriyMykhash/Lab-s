package com.Mykhash;

class Americano extends Bavarage {

    protected final float cost = 25.5f;
    protected final String description = "Americano";

    @Override
    float cost() {
        return cost;
    }

    @Override
    String description() {
        return description;
    }
}
