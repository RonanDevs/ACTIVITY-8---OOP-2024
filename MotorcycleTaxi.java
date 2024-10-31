public class MotorcycleTaxi implements Vehicle {
    private final double price = 50.0;

    @Override
    public void travel(String destination) {
        System.out.println("Travelling to "+ destination + " by MotorcycleTaxi.");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
