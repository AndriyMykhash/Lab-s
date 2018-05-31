package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PizzaStore pizzaStore;

        System.out.println("Виберіть піцерію: \n 1 - Ню-Йоркська піцерія \n 2 - Чикагська піцерія");

        switch (sc.nextInt()){
            case 1:
                System.out.println(" Сир\n Маргарита");
                pizzaStore = new NYPizzaStore();
                pizzaStore.createPizza(sc.next());
            break;

            case 2:
                System.out.println(" Сир\n Маргарита");
                pizzaStore = new ChegagoPizzaStore();
                pizzaStore.createPizza(sc.next());
            break;

            default: break;
        }
    }
}
