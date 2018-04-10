package com.Mykhash;

public class AirCondStop implements IComand {
    private AirCondition air;

    @Override
    public void execute() {
        air.stop();
    }

    AirCondStop(AirCondition air){
        this.air = air;
    }
}
