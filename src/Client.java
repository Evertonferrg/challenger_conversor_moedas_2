import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Client {
     //endereco = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD"

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD"))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
    String json = response.body();

    public Client() throws IOException, InterruptedException {
    }
}
