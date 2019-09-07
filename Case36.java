/*
36. Basic authentication should not be used
*/

/**
 *
 * @author john
 */
public class Case36 {
    public void doit() {
        String encoding = Base64Encoder.encode ("login:passwd");
        org.apache.http.client.methods.HttpPost httppost = new HttpPost(url);
        httppost.setHeader("Authorization", "Basic " + encoding);  // Noncompliant

        // Using HttpURLConnection
        String encoding = Base64.getEncoder().encodeToString(("login:passwd").getBytes(‌"UTF‌​-8"​));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic " + encoding); // Noncompliant

    }
}
