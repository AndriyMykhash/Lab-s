package com.Mykhash;

public class Main {

    public static void main(String[] args) {
	    IComand lightOff = new LightOff(new Lamp());
        IComand lightOn = new LightOn(new Lamp());

        IComand airCondRun = new AirCondRun(new AirCondition());
        IComand airCondStop = new AirCondStop(new AirCondition());
        IComand airCondSet = new AirCondSet(new AirCondition());

        lightOn.execute();
        lightOff.execute();

        System.out.println();

        airCondRun.execute();
        airCondSet.execute();
        airCondStop.execute();


    }
}
