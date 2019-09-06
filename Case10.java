
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.ws.rs.client.Client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john
 */
public class Case10 {
    public static void doit() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sslcontext = SSLContext.getInstance( "TLS" );
        try {
            sslcontext.init(null, null, null);
        } catch (KeyManagementException ex) {
            Logger.getLogger(Case10.class.getName()).log(Level.SEVERE, null, ex);
        }
        Client client = javax.ws.rs.client.ClientBuilder.newBuilder().sslContext(sslcontext).hostnameVerifier(new HostnameVerifier() {
        @Override
        public boolean verify(String requestedHost, SSLSession remoteServerSession) {
          return true;  // Noncompliant
        }
        }).build();
    }
}
