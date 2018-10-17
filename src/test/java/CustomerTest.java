import Components.Engine;
import Components.FuelTank;
import Components.IComponents;
import Components.Tyres;
import dealership.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    Customer customer;
    @Before
    public void before() {
        customer = new Customer(500.0);
    }

    @Test
    public void startsWithMoney(){
        assertEquals(500.0, customer.getMoney(), 0);
    }

    @Test
    public void canMakePayment() {
        assertTrue(customer.makePayment(100.0));
        assertEquals(400.0, customer.getMoney(), 0);
    }

    @Test
    public void cannotMakePayment() {
        assertFalse(customer.makePayment(600.0));
        assertEquals(500.0, customer.getMoney(), 0);
    }

    @Test
    public void hasNoVehicles(){
        assertEquals(0, customer.getVehicleCount());
    }

    @Test
    public void canAddVehicle(){
        ArrayList<IComponents> components = new ArrayList<>();
        Engine engine = new Engine();
        Tyres tyres = new Tyres();
        FuelTank fuelTank = new FuelTank();
        components.add(engine);
        components.add(tyres);
        components.add(fuelTank);
        Car car = new Car(100.0, "blue", components);
        customer.addVehicle(car);
        assertEquals(1, customer.getVehicleCount());
    }
}
