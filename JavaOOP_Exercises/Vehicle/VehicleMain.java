package Vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car car2 = new Car("Ranger", "Vios", 2020, 16.8);
        Truck truck2 = new Truck("Raptor", "Hilux", 2021, 3.0);
 
        car2.displayDetails();
        truck2.displayDetails();
    }
}