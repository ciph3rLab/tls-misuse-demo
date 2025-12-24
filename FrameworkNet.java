import javax.net.ssl.*;

public class FrameworkNet {

    public static SSLSocketFactory getSocketFactory() throws Exception {
        return TLSHelper.createFactory();
    }
}
