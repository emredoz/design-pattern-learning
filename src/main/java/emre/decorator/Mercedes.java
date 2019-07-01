package emre.decorator;


public class Mercedes implements Engine {
    public void runEngine() {
        System.out.println("Mercedes engine works");
    }

    public void stopEngine() {
        System.out.println("Mercedes engine has stopped");
    }
}
