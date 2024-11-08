package iii_extras.request_java_11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;

public class Main {
    private static final String urlRequest = "https://jsonplaceholder.typicode.com/todos";

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        makeRequisition(urlRequest + "/1");

        String bodyRequest = String.format("{" +
                "   \"title\":\"%s\"," +
                "   \"completed\":\"%s\"," +
                "   \"userId\":\"%d\"" +
                "}", "delectus aut autem", false, 999);

        makeRequisition(urlRequest, "POST", bodyRequest);
    }

    public static void makeRequisition(String url) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest requisition = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(requisition, HttpResponse.BodyHandlers.ofString());
        showResponse(response);
    }

    public static void makeRequisition(String url, String method, String bodyRequest) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest requisition = HttpRequest.newBuilder()
                .uri(new URI(url))
                .header("Content-Type", "application/json")
                .method(method, Objects.isNull(bodyRequest) ? HttpRequest.BodyPublishers.noBody() : HttpRequest.BodyPublishers.ofString(bodyRequest))
                .build();

        HttpResponse<String> response = httpClient.send(requisition, HttpResponse.BodyHandlers.ofString());

        showResponse(response);
    }

    public static void showResponse(HttpResponse<String> response) {
        System.out.println("Código de Resposta:");
        System.out.println(response.statusCode());
        System.out.println("Conteúdo da Resposta:");
        System.out.println(response.body());
        System.out.println("Headers da Resposta:");
        response.headers().map().forEach((headerKey, headerValue) -> System.out.println(headerKey + ": " + headerValue));
    }
}
