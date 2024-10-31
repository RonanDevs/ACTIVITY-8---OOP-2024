public class Main {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("      Welcome to Travel System     ");
        System.out.println("===================================");

        Student student = new Student();
        TravelService travelService = new TravelService(student);

        travelService.selectVehicle();       
        travelService.travelToDestination(); 

        System.out.println("===================================");
        System.out.println("   Thank you for using our system! ");
        System.out.println("===================================");
    }
}

