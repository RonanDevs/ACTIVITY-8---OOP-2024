public class Jeepney implements Vehicle {
    private final double price = 20.0;

    @Override
    public void travel(String destination) {
        System.out.println("Travelling to "+ destination + " by Jeepney.");
    }

    @Override
    public double getPrice() {
        return price;
    }
}