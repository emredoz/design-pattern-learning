package emre.decorator;


public class Volkswagen implements Engine {
    public void runEngine() {
        System.out.println("Volkswagen engine works");
    }

    public void stopEngine() {
        System.out.println("Volkswagen engine has stopped");
    }
}
