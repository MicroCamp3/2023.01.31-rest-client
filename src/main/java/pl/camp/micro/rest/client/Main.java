package pl.camp.micro.rest.client;

import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/rest2";

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("param1", "cos");
        Book bookFromServer = restTemplate.getForObject(url, Book.class, queryParams);
        System.out.println(bookFromServer);

        String url2 = "http://localhost:8080/rest3";
        Book book = new Book(1, "Tytul", "Autor", 34.34, 213);
        User userFromServer = restTemplate.postForObject(url2, book, User.class);

        System.out.println(userFromServer);
    }
}
