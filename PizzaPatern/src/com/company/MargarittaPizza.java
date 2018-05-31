package com.company;

public class MargarittaPizza extends Pizza {

    private void cut(){
        System.out.println("Нарізається кубиками ");
    }
    void prepare(){
        bake();
        cut();
        box();
    }
}
