package com.Mykhash;

public class Tea extends Bavarage{

    private final float cost = 25.5f;
    private final String description = "Tea";

    @Override
    float cost() {
        return cost;
    }

    @Override
    String description() {
        return description;
    }
}
