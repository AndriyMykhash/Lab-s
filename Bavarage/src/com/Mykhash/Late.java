package com.Mykhash;

public class Late extends  Bavarage {

    private final float cost = 30f;
    private final String description = "Late";

    @Override
    float cost() {
        return cost;
    }

    @Override
    String description() {
        return description;
    }
}
