package com.ksubaka;

import org.springframework.web.client.RestTemplate;

/**
 * Created by davicres on 12/04/2016.
 */
public class HttpCall {
    private RestTemplate restTemplate = new RestTemplate();
    private final Class<? extends Response> classToMap;
    private final String endpoint;

    public HttpCall(String endpoint, Class<? extends Response> classToMap) {
        this.endpoint = endpoint;
        this.classToMap = classToMap;
    }

    public Response getResponse() {
        return restTemplate.getForObject(endpoint, classToMap);
    }

}
