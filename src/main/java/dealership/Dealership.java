package dealership;

import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Vehicle> vehicles;

    public Dealership() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public int getVehicleCount() {
        return vehicles.size();
    }
}
