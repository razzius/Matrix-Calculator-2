package matrix.calculation;
import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class App {
    private static final String API_URL = "https://www.thebluealliance.com/api/v3";
    public static void main(String[] args) throws IOException{
        OkHttpClient client = new OkHttpClient();
        final String STATUS_URL = API_URL + "/status";
        Request request = new Request.Builder()
        .url(STATUS_URL).build();
        try(Response response = client.newCall(request).execute()){
            System.out.println(response.body().string());
        }
    }
}