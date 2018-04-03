package com.Mykhash;

class ChicagoPizza implements IPizzaFactory{

    public void createPizza(String pizzaName){
        Pizza pizza;

        if (pizzaName.compareTo("Карпатська")==0){
            pizza = new KarpatianPizza(" по Чикагськи");
        }
        else if (pizzaName.compareTo("Гавайська")==0){
            pizza = new GavaiPizza(" по Чикагськи");
        }
    }
}
