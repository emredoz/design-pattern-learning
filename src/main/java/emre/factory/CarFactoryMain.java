package emre.factory;

public class CarFactoryMain {

    public static void main(String[] args) {
        Car mercedes = CarFactory.getCar(CarBrand.MERCEDES);
        Car bmv = CarFactory.getCar(CarBrand.BMW);
        Car volkswagen = CarFactory.getCar(CarBrand.VOLKSWAGEN);
    }
}
