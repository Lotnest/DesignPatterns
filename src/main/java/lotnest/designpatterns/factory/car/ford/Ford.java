package lotnest.designpatterns.factory.car.ford;

import lotnest.designpatterns.factory.car.Car;
import lotnest.designpatterns.factory.car.SteeringWheelPosition;

public class Ford extends Car {

    public Ford(String productionYear, String engine, String fuel, SteeringWheelPosition steeringWheelPosition) {
        super(productionYear, engine, fuel, steeringWheelPosition);
    }
}
