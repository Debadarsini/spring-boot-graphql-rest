package deba.practice.graphql.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import deba.practice.graphql.beans.Destination;
import deba.practice.graphql.beans.Property;

@Component
public class DestinationRepository {

    public List<Destination> findBySearchTermUiId(deba.practice.graphql.beans.Property property) {
        // TODO Auto-generated method stub
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Authorization bearer goes here");

        String url = "url";
        HttpEntity<String> request = new HttpEntity<String>(headers);
        
        RestTemplate restTemplate = new RestTemplate();
       /* ResponseEntity<List<Destination>> response = restTemplate.exchange(url+property.getPrimary_market_search_term_uuid(), 
                        HttpMethod.GET, request, new ParameterizedTypeReference<List<Destination>>() {
                        });*/
        ResponseEntity<Destination> response = restTemplate.exchange(url+property.getDestinationId(), 
                HttpMethod.GET, request, Destination.class);
     //  Destination[] destionations = {response.getBody()};
        return Arrays.asList(response.getBody());
    }

}
