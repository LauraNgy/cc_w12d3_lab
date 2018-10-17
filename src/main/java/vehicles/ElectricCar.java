package vehicles;

import Components.IComponents;

import java.util.ArrayList;

public class ElectricCar extends Vehicle {
    public ElectricCar(double price, String colour, ArrayList<IComponents> components) {
        super(price, colour, components);
    }
}
