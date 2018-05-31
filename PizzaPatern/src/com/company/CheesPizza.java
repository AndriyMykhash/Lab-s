package com.company;

public class CheesPizza extends Pizza{

    private void cut(){
        System.out.println("Нарізається секторами ");
    }
    void prepare(){
        bake();
        cut();
        box();
    }
}
