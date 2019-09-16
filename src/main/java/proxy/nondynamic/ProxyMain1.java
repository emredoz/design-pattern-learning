package proxy.nondynamic;

public class ProxyMain1 {

    public static void main(String[] args) {
        OfficeInternetAccess proxy = new ProxyInternetAccess(new RealInternetAccess());
        System.out.println(proxy.grantInternetAccess("qwe"));
        System.out.println(proxy.grantInternetAccess("abc"));
    }
}
