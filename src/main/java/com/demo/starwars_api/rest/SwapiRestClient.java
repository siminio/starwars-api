package com.demo.starwars_api.rest;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@Component
public class SwapiRestClient<T> {
    private final RestClient restClient;

    public SwapiRestClient(RestClient.Builder builder) {
        this.restClient = builder.baseUrl("https://swapi.dev/api").build();
    }

    public List<T> findAllElements(String endpoint) {
        @SuppressWarnings("unchecked")
        SwapiResponse<T> response = this.restClient.get()
                                                   .uri(endpoint)
                                                   .retrieve()
                                                   .body(SwapiResponse.class);
        return response.getResults();    
    }

    public T findById(Class<T> clazz, String endpoint, int id) {
        return this.restClient.get()
                              .uri(endpoint + id)
                              .retrieve()
                              .body(clazz);
    }

    public List<T> search(String endpoint, String search) {
        @SuppressWarnings("unchecked")
        SwapiResponse<T> response = this.restClient.get()
                                                   .uri(endpoint + "?search=" + search)
                                                   .retrieve()
                                                   .body(SwapiResponse.class);
        return response.getResults();
    }
}
