import Components.Engine;
import Components.FuelTank;
import Components.IComponents;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class CarTest {

    Car car;
    @Before
    public void before() {
        ArrayList<IComponents> components = new ArrayList<>();
        Engine engine = new Engine();
        Tyres tyres = new Tyres();
        FuelTank fuelTank = new FuelTank();
        components.add(engine);
        components.add(tyres);
        components.add(fuelTank);
        car = new Car(100.0, "blue", components);
    }


    @Test
    public void hasColour() {
        assertEquals("blue", car.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(100.0, car.getPrice());
    }

    @Test
    public void hasComponents() {
        assertEquals(3, car.getComponentCount());
    }
}
