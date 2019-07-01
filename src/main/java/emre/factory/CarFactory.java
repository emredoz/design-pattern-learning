package emre.factory;

public class CarFactory {

    public static Car getCar(CarBrand brand) {
        Car car = null;
        switch (brand) {
            case BMW:
                car = new Bmv();
                break;
            case MERCEDES:
                car = new Mercedes();
                break;
            case VOLKSWAGEN:
                car = new Volkswagen();
                break;
        }
        return car;
    }

}
