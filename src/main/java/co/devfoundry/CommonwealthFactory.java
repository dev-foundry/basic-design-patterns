package co.devfoundry;

import co.devfoundry.cars.*;

public class CommonwealthFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.RIGHT;


    public Car buildFord(FordModel model) {
        switch(model) {
            case CMAX:
                return new Ford("2018","1.8","Diesiel", position);
            case FOCUS:
                return new Ford("2018","1.6", "Gas", position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }

    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new BMW("2018","1.8","Diesiel", position);
            case E60:
                return new BMW("2018","1.6", "Gas", position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }
}
