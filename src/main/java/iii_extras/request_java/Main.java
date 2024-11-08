package iii_extras.request_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    private static final String urlRequest = "https://jsonplaceholder.typicode.com/todos";

    public static void main(String[] args) throws IOException {

        makeRequisition(urlRequest + "/1" );

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("title", "delectus aut autem");
        requestBody.put("completed", false);
        requestBody.put("userId", 999);

        makeRequisition(urlRequest, "POST", requestBody);
    }

    public static void makeRequisition(String urlPath) throws IOException {
        URL url = new URL(urlPath);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        connection.connect();
        showResponse(connection);
    }

    public static void makeRequisition(String urlPath, String method, Map<String, ?> requestBody) throws IOException {
        URL url = new URL(urlPath);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod(method);

        if (Objects.nonNull(requestBody)) {
            connection.setDoOutput(true);
            try (PrintWriter writer = new PrintWriter(connection.getOutputStream())) {
                requestBody.forEach((key,value) -> writer.print(key + "=" + value + "&"));
            }
        }

        connection.connect();
        showResponse(connection);
    }

    public static void showResponse(HttpURLConnection connection) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String row;
            while ((row = reader.readLine()) != null) {
                content.append(row);
            }
        }

        System.out.println("Código de Resposta:");
        System.out.println(connection.getResponseCode());
        System.out.println("Conteúdo da Resposta:");
        System.out.println(content);
        System.out.println("Header da Resposta:");
        connection.getHeaderFields().forEach((headerKey, headerValue) -> System.out.println(headerKey + ": " + headerValue));
    }
}
