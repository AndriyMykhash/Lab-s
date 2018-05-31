package com.company;

public class ChegagoPizzaStore extends PizzaStore{

    @Override
    void createPizza(String item) {
        Pizza pizza = null;
        if (item.compareTo("Сир") == 0){
            pizza = new CheesPizza();
            pizza.setName("Чикагська сирна піца");
            ((CheesPizza) pizza).prepare();
        }
        else if (item.compareTo("Маргарита") == 0){
            pizza = new CheesPizza();
            pizza.setName("Чикагська піца Маргарита");
            ((CheesPizza) pizza).prepare();
        }
        else {
            System.out.println("Таких піц нема");
            createPizza(item);
        }
    }
}
