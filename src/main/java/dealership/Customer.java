package dealership;

import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private double money;
    ArrayList<Vehicle> vehicles;

    public Customer(double money) {
        this.money = money;
        vehicles = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public boolean makePayment(double value) {
        boolean success = false;
        if (value <= money) {
            success = true;
            money -= value;
        }
        return success;
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
