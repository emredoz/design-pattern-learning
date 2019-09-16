package proxy.nondynamic;

public class RealInternetAccess implements OfficeInternetAccess {
    @Override
    public boolean grantInternetAccess(String webSite) {
        System.out.println("Internet accessed to website: " + webSite);
        return true;
    }
}
