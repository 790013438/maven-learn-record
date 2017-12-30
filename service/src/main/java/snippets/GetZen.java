package snippets;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetZen {

    public static String get() throws IOException {

        // Request feed data
        String requestUrl = "https://api.github.com/zen";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(requestUrl);
        HttpResponse httpResponse = httpClient.execute(httpGet);

        // Extract feed data from response
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
        String feed = bufferedReader.readLine();

        httpClient.close();

        return feed;
    }
}
