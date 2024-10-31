public class Helicopter implements Vehicle {
    private final double price = 1000.0;

    @Override
    public void travel(String destination) {
        System.out.println("Travelling to " + destination + " by Helicopter.");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
