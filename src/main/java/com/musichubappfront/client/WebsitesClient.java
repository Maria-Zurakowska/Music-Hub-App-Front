package com.musichubappfront.client;

import com.musichubappfront.Dto.ResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebsitesClient {

    private final RestTemplate restTemplate;

    public WebsitesClient(RestTemplate restTemplate) {

        this.restTemplate = restTemplate;
    }

    public ResponseDto getMusicianInfo(String musician){
        String url ="http://localhost:8080" + musician;
        ResponseDto response = restTemplate.getForObject(url, ResponseDto.class);
        return response;
    }

}
