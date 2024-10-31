public class Bus implements Vehicle {
    private final double price = 30.0;

    @Override
    public void travel(String destination) {
        System.out.println("Travelling to " + destination + " by Bus.");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
