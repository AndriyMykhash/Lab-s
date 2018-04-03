package com.Mykhash;

public class NewYorkPizza implements IPizzaFactory{

    public void createPizza(String pizzaName){
        Pizza pizza;

        if (pizzaName.compareTo("Карпатська")==0){
            pizza = new KarpatianPizza(" по НюЙорськи");
        }
        else if (pizzaName.compareTo("Гавайська")==0){
            pizza = new GavaiPizza(" по НюЙорськи");
        }
    }
}
