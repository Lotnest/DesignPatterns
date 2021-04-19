package lotnest.designpatterns.factory.car.bmw;

import lotnest.designpatterns.factory.car.Car;
import lotnest.designpatterns.factory.car.SteeringWheelPosition;

public class BMW extends Car {

    public BMW(String productionYear, String engine, String fuel, SteeringWheelPosition steeringWheelPosition) {
        super(productionYear, engine, fuel, steeringWheelPosition);
    }
}
