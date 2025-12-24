import javax.net.ssl.HttpsURLConnection;

public class App {

    public static void init() throws Exception {
        HttpsURLConnection.setDefaultSSLSocketFactory(
            FrameworkNet.getSocketFactory()
        );
    }
}
