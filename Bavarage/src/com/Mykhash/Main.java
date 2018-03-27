package com.Mykhash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Bavarage b;

        System.out.println("Виберіть напиток: \n 1 - Американо\n 2 - Лате \n 3 - Чай\n>:");
        boolean exit = true;
        switch (scanner.nextInt()){

            case 1: b = new Americano(); res(b);
                break;
            case 2: b = new Late(); res(b);
                break;
            case 3: b = new Tea(); res(b);
                break;
        }
    }

    public static void res(Bavarage b){
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        System.out.println("Виберіть додатоки до напитка:");
        exit = true;
        do {
            System.out.println(" 1 - Молоко\n 2 - Цукор\n 3 - Закінчити вибір\n>:");
            switch (scanner.nextInt()) {

                case 1:
                    b = new Milk(b);
                    break;
                case 2:
                    b = new Sugar(b);
                    break;
                case 3: exit = false;
            }
        }while (exit);
        System.out.println("Вміст: "+b.description()+"\n Ціна: "+b.cost());
    }
}
