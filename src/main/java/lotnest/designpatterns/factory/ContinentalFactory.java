package lotnest.designpatterns.factory;

import lotnest.designpatterns.factory.car.SteeringWheelPosition;
import lotnest.designpatterns.factory.car.bmw.BMW;
import lotnest.designpatterns.factory.car.bmw.BMWModel;
import lotnest.designpatterns.factory.car.Car;
import lotnest.designpatterns.factory.car.ford.Ford;
import lotnest.designpatterns.factory.car.ford.FordModel;

public class ContinentalFactory implements Factory {

    public static final SteeringWheelPosition STEERING_WHEEL_POSITION = SteeringWheelPosition.LEFT;

    public Car buildFord(FordModel fordModel) {
        switch (fordModel) {
            case CMAX:
                return new Ford("2018", "1.8", "Diesiel", STEERING_WHEEL_POSITION);
            case FOCUS:
                return new Ford("2018", "1.6", "Gas", STEERING_WHEEL_POSITION);
            default:
                throw new IllegalArgumentException("Unknown FordModel");
        }
    }

    public Car buildBMW(BMWModel bmwModel) {
        switch (bmwModel) {
            case X5:
                return new BMW("2018", "1.8", "Diesiel", STEERING_WHEEL_POSITION);
            case E60:
                return new BMW("2018", "1.6", "Gas", STEERING_WHEEL_POSITION);
            default:
                throw new IllegalArgumentException("Unknown BMWModel");
        }
    }
}
