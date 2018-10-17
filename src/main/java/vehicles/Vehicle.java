package vehicles;

import Components.IComponents;

import java.util.ArrayList;

public abstract class Vehicle {
    private double price;
    private String colour;
    private ArrayList<IComponents> components;
    private double rentalPrice;

    public Vehicle(double price, String colour, ArrayList<IComponents> components) {
        this.price = price;
        this.colour = colour;
        this.components = components;
        rentalPrice = price * 0.1;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getComponentCount() {
        return components.size();
    }
}
