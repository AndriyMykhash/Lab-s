package com.Mykhash;

class Sugar extends AddOns {


    private final float cost = 3f;
    private final String description = "Sugar";

    Sugar(Bavarage bavarage) {
        super(bavarage);
    }

    @Override
    float cost() {
        return cost + bavarage.cost();
    }

    @Override
    String description() {
        return bavarage.description()+" "+description;
    }
}
