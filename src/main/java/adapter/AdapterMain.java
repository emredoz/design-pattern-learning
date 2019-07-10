package adapter;

public class AdapterMain {

    public static void main(String[] args) {
        Movable mercedes = new Mercedes();
        // Using adapter by clients
        MovableAdapter adaptor = new MovableAdapterImpl(mercedes);
        System.out.println(adaptor.getSpeed());
    }

}
