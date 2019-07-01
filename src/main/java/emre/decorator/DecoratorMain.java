package emre.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Engine mercedes = new Mercedes();
        mercedes.runEngine();
        mercedes.stopEngine();

        Engine bmw = new Bmv();
        bmw.runEngine();
        bmw.stopEngine();

        Engine volkswagen = new Volkswagen();
        volkswagen.runEngine();
        volkswagen.stopEngine();
    }
}
