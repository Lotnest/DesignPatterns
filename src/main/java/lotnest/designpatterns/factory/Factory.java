package lotnest.designpatterns.factory;

import lotnest.designpatterns.factory.car.Car;
import lotnest.designpatterns.factory.car.bmw.BMWModel;
import lotnest.designpatterns.factory.car.ford.FordModel;

public interface Factory {

    Car buildFord(FordModel model);
    Car buildBMW(BMWModel model);
}
