package emre.decorator;


public class Bmv implements Engine {
    public void runEngine() {
        System.out.println("Bmv engine works");
    }

    public void stopEngine() {
        System.out.println("Bmv engine has stopped");
    }
}
