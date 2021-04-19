package lotnest.designpatterns.factory.car;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {

    private final String productionYear;
    private final String engine;
    private final String fuel;
    private final SteeringWheelPosition steeringWheelPosition;
}
