package co.devfoundry;

import co.devfoundry.cars.BMWModel;
import co.devfoundry.cars.Car;
import co.devfoundry.cars.FordModel;

public interface Factory {

    Car buildFord(FordModel model);
    Car buildBMW(BMWModel model);

}
