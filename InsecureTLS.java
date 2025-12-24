import javax.net.ssl.*;
import java.security.cert.X509Certificate;

public class InsecureTLS {

    public static void disableTLSVerification() throws Exception {

        TrustManager[] trustAllCerts = new TrustManager[] {
            new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                    // no-op
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                    // no-op
                }
            }
        };

        SSLContext sc = SSLContext.getInstance("TLS");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());

        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    }
}
