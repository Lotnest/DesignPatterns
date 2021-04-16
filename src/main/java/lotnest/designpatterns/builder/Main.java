package lotnest.designpatterns.builder;

public class Main {

    public static void main(String[] args) {
        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").build();
        System.out.println(flightLeg);
    }
}
