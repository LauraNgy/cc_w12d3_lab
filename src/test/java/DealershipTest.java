import Components.Engine;
import Components.FuelTank;
import Components.IComponents;
import Components.Tyres;
import dealership.Customer;
import dealership.Dealership;
import dealership.Till;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Car car;
    ElectricCar electricCar;
    Dealership dealership;
    Till till;
    @Before
    public void before() {
        ArrayList<IComponents> components = new ArrayList<>();
        Engine engine = new Engine();
        Tyres tyres = new Tyres();
        FuelTank fuelTank = new FuelTank();
        components.add(engine);
        components.add(tyres);
        components.add(fuelTank);
        car = new Car(100, "blue", components);
        components.clear();
        engine = new Engine();
        tyres = new Tyres();
        components.add(engine);
        components.add(tyres);
        electricCar = new ElectricCar(150, "green", components);
        till = new Till(500.0);
        dealership = new Dealership(till);
    }

    @Test
    public void hasNoVehicles() {
        assertEquals(0, dealership.getVehicleCount());
    }


    @Test
    public void hasVehicles() {
        dealership.addVehicle(car);
        dealership.addVehicle(electricCar);
        assertEquals(2, dealership.getVehicleCount());
    }

    @Test
    public void canSellCar() {
        Customer customer = new Customer(500);
        dealership.addVehicle(car);
        dealership.sellVehicle(customer, car);
        assertEquals(400.0, customer.getMoney(), 0);
        assertEquals(600.0, till.getMoney(), 0);
        assertEquals(0, dealership.getVehicleCount());
        assertEquals(1, customer.getVehicleCount());
    }
}
