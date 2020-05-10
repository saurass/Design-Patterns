import java.util.HashMap;
// we are using both singleton and factory method together
public class OperatingSystemFactory {
    private static OperatingSystemFactory osfactory;
    public HashMap<String, OS> os2obj = new HashMap<String, OS>();

    private OperatingSystemFactory() {
        os2obj.put("windows", new Windows());
        os2obj.put("IOS", new IOS());
        os2obj.put("Android", new Android());
    }

    public static OperatingSystemFactory getInstance() {
        if(osfactory == null) {
            osfactory = new OperatingSystemFactory();
        }
        return osfactory;
    }
}
