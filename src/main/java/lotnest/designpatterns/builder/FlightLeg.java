package lotnest.designpatterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
public class FlightLeg {

    private final String from;
    private final String to;
    @Setter
    private int price;
    @Setter
    private boolean delayed;

    private FlightLeg(FlightLegBuilder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.delayed = builder.delayed;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                ", delayed=" + delayed +
                '}';
    }

    public static class FlightLegBuilder {

        private final String from;
        private final String to;
        private final boolean delayed;
        private int price;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed = false;
        }

        public FlightLegBuilder price(int price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            if (this.price == 0) {
                throw new IllegalStateException("Missing required field - price");
            }
            return new FlightLeg(this);
        }
    }
}
