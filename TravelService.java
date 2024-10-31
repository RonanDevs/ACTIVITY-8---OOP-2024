/*The term "Travel Service" is used because this class functions as a service layer in my application. 
It is responsible for managing the overall travel-related tasks, like helping the user select a vehicle, 
setting a destination, and initiating the travel process.
*/

import java.util.Scanner;

public class TravelService {
    private final Student student;
    
    // Constructor: intializes the TravelService with a Student object 
    public TravelService(Student student) {
        this.student = student;
    }
    
    // Method for selecting a vehicle
    public void selectVehicle() {
        System.out.println("===================================");
        System.out.println("         Vehicle Selection         ");
        System.out.println("===================================");
        System.out.println("Choose your vehicle for travel:");
        System.out.println("1. Jeepney         - 20.0");
        System.out.println("2. Motorcycle Taxi  - 50.0");
        System.out.println("3. Helicopter      - 1000.0");
        System.out.println("4. Bus             - 30.0");
        System.out.println("===================================");
        
        // Scanner to capture user's choice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        Vehicle vehicle;
        
        // Deciding on the vehicle based on user input
        switch (choice) {
            case 1:                         // If the user enters 1: vehicle becomes a Jeepney.
                vehicle = new Jeepney();
                break;
            case 2:                         // If the user enters 2: vehicle becomes a MotorcycleTaxi.
                vehicle = new MotorcycleTaxi();
                break;
            case 3:                        // If the user enters 3: vehicle becomes a Helicopter.
                vehicle = new Helicopter();
                break;
            case 4:                        // If the user enters 4: vehicle becomes a Bus.
                vehicle = new Bus(); 
                break;
            default:                      /*  If the user enters anything else, A message is displayed,
                                          and vehicle is set to a Bus by default. */
                System.out.println("Invalid choice. Defaulting to Bus.");  
                vehicle = new Bus(); 
        }
        
        // Setting the chosen vehicle for the student 
        student.setVehicle(vehicle); 
        System.out.println("-----------------------------------");
    }

    // Method for setting the destination and iniating travel
    public void travelToDestination() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("         Destination Input         ");
        System.out.println("===================================");
        
        System.out.print("Enter your destination: ");
        String destination = scanner.nextLine();
        System.out.println("-----------------------------------");
        
        // Student starts travel to the specified destination
        student.travelTo(destination);
    }
}
