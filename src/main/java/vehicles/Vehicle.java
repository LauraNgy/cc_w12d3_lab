package vehicles;

import Components.IComponents;

import java.util.ArrayList;

public abstract class Vehicle {
    private int price;
    private String colour;
    private ArrayList<IComponents> components;

    public Vehicle(int price, String colour, ArrayList<IComponents> components) {
        this.price = price;
        this.colour = colour;
        this.components = components;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getComponentCount() {
        return components.size();
    }
}
