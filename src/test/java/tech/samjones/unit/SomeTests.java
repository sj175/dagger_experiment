package tech.samjones.unit;

import org.junit.Assert;
import org.junit.Test;
import tech.samjones.Car;
import tech.samjones.DaggerVehiclesComponent;
import tech.samjones.VehiclesComponent;

public class SomeTests {

    @Test
    public void checkThatDependenciesInjected() {
        VehiclesComponent component = DaggerVehiclesComponent.create();

        Car carOne = component.buildCar();
        Car carTwo = component.buildCar();

        Assert.assertNotNull(carOne);
        Assert.assertNotNull(carTwo);
        Assert.assertNotNull(carOne.getEngine());
        Assert.assertNotNull(carTwo.getEngine());
        Assert.assertNotNull(carOne.getbrand());
        Assert.assertNotNull(carTwo.getbrand());

        Assert.assertNotEquals(carOne.getEngine(), carTwo.getEngine());
        Assert.assertEquals(carOne.getbrand(), carTwo.getbrand());

    }
}
