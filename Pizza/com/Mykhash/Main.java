package com.Mykhash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Де ви є?\n 1 - NewYork \n 2 - Chicago \n>: ");
        IPizzaFactory newYorkPizza = new NewYorkPizza();
        IPizzaFactory chicagoPizza = new ChicagoPizza();

        switch (scanner.nextInt()){
            case 1: System.out.print("Яку піцу ви замовите?\n 1 - Карпатська\n 2 - Гавайська \n>: ");
                    if (scanner.nextInt() == 1)
                         newYorkPizza.createPizza("Карпатська");
                    else
                         newYorkPizza.createPizza("Гавайська");
                break;
            case 2: System.out.print("Яку піцу ви замовите?\n 1 - Карпатська\n 2 - Гавайська \n>: ");
                     if (scanner.nextInt() == 1)
                         chicagoPizza.createPizza("Карпатська");
                    else
                         chicagoPizza.createPizza("Гавайська");
                break;
        }
    }
}
