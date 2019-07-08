package emre.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        // Creating objects
        Engine mercedes = new Mercedes();
        Engine bmw = new Bmv();
        Engine volkswagen = new Volkswagen();

        // Using decorator by clients
        mercedes.runEngine();
        mercedes.stopEngine();

        bmw.runEngine();
        bmw.stopEngine();

        volkswagen.runEngine();
        volkswagen.stopEngine();
    }
}
