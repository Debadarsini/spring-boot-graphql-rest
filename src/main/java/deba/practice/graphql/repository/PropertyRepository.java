package deba.practice.graphql.repository;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import deba.practice.graphql.beans.Property;
import deba.practice.graphql.beans.PropertyQuery;

@Component
public class PropertyRepository {

    public List<Property> findByUnitUuid(PropertyQuery propertyQuery) {
        // TODO Auto-generated method stub
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Auth Header goes Here");

        String url = "url goes here";
        HttpEntity<String> request = new HttpEntity<String>(headers);

        RestTemplate restTemplate = new RestTemplate();
        System.out.println(url + propertyQuery.toString());
        try {
            ResponseEntity<List<Property>> response = restTemplate.exchange(url + propertyQuery.toString(), 
                    HttpMethod.GET, request, new ParameterizedTypeReference<List<Property>>() {
                    });
          /*  ResponseEntity<Property> response = restTemplate.exchange(url + propertyQuery.toString(), HttpMethod.GET,
                    request, Property.class);*/
            System.out.println(response.toString());
            return response.getBody();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
