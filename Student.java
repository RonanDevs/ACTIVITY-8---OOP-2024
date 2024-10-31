// INSTANCE VARIABLE 
public class Student { /*By using the Vehicle interface, the Student class can work with different types of vehicles 
                                without depending on specific vehicle implementations. This is called polymorphism. */
    private Vehicle vehicle; 

    // SET VEHICLE METHOD 
    public void setVehicle(Vehicle vehicle) {   /*Using this method, the type of vehicle can be dynamically changed, 
                                                meaning the Student can switch from one vehicle to another. */  
        this.vehicle = vehicle; 
    }

    // TRAVEL TO METHOD
    public void travelTo(String destination) {  /*If vehicle is null, meaning no vehicle has been set for the Student, 
                                                  it displays a message: "No vehicle set for travel." */
        if (vehicle != null) {
            vehicle.travel(destination); 
        } else {
            System.out.println("No vehicle set for travel.");   
        }
    }
}

