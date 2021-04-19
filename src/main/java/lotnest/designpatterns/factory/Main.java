package lotnest.designpatterns.factory;

import lotnest.designpatterns.factory.car.Car;
import lotnest.designpatterns.factory.car.bmw.BMWModel;
import lotnest.designpatterns.factory.car.ford.FordModel;

public class Main {

    public static void main(String[] args) {
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMAX);
        System.out.println(ford.getSteeringWheelPosition());
    }
}
