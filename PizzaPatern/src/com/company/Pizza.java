package com.company;

public abstract class Pizza {

    protected String name;

    void setName(String setName){
        name = setName;
    }

    protected void bake(){
        System.out.println("Печеться "+name);
    }

    protected void box(){
        System.out.println("Упаковуєтся");
    }




}