package emre.adaptor;

public class AdaptorMain {

    public static void main(String[] args) {
        Movable mercedes = new Mercedes();
        MovableAdapter adaptor = new MovableAdapterImpl(mercedes);
        System.out.println(adaptor.getSpeed());
    }

}
