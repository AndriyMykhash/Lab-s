package com.Mykhash;

public class LightOff implements IComand {
    private Lamp lamp;
    @Override
    public void execute() {
        lamp.off();
    }
    LightOff(Lamp lamp){
        this.lamp = lamp;
    }
}
