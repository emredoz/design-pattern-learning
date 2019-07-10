package factory;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void test() {
        Car mercedes = CarFactory.getCar(CarBrand.MERCEDES);
        Car bmv = CarFactory.getCar(CarBrand.BMW);
        Car volkswagen = CarFactory.getCar(CarBrand.VOLKSWAGEN);
    }
}
