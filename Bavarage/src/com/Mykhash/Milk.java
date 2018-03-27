package com.Mykhash;

class Milk extends AddOns{

    private final float cost = 7f;
    private final String description = "Milk";

    @Override
    float cost() {
        return cost + bavarage.cost();
    }

    @Override
    String description() {
        return bavarage.description()+" "+description;
    }

    public Milk(Bavarage b){
       super(b);
    }
}
