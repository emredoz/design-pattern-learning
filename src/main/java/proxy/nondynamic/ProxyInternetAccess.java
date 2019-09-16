package proxy.nondynamic;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ProxyInternetAccess implements OfficeInternetAccess {

    private RealInternetAccess realInternetAccess;
    private static Set<String> bannedList = Arrays.asList("abc","def").stream().collect(Collectors.toSet());

    public ProxyInternetAccess(RealInternetAccess realInternetAccess) {
        this.realInternetAccess = realInternetAccess;
    }

    @Override
    public boolean grantInternetAccess(String webSite) {
        if (!bannedList.contains(webSite)){
            realInternetAccess.grantInternetAccess(webSite);
            return true;
        }
        System.out.println("Access Denied");
        return false;
    }
}
