import com.google.gson.Gson;
import com.google.gson.JsonObject;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    private String urlUsada= "https://v6.exchangerate-api.com/v6/";
    private String apikey= "09047b438528ead457d5f1b9";
    double cantidad=0;

    public void cambioMoneda(String monedaBase, String monedaDestino, double cantidad) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(urlUsada + apikey + "/pair/"+ monedaBase +"/"+ monedaDestino + "/"+ cantidad))
        .build();


        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String conversionResult = response.body();
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(conversionResult, JsonObject.class);
        double result = jsonObject.get("conversion_result").getAsDouble();
        System.out.println(cantidad+monedaBase + " "+ "es igual a:"+ " " + result+ " "+ monedaDestino);








    }


}



