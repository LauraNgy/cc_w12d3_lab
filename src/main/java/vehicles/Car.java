package vehicles;

import Components.IComponents;

import java.util.ArrayList;

public class Car extends Vehicle {
    public Car(int price, String colour, ArrayList<IComponents> components) {
        super(price, colour, components);
    }
}
