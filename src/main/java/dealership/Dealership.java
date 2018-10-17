package dealership;

import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Vehicle> vehicles;
    private Till till;

    public Dealership(Till till) {
        this.vehicles = new ArrayList<>();
        this.till = till;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    public void sellVehicle(Customer customer, Vehicle vehicle) {
       double price = vehicle.getPrice();
       if (customer.makePayment(price)) {
           till.takePayment(price);
           vehicles.remove(vehicle);
           customer.addVehicle(vehicle);
       }
    }
}
