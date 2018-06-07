package deba.practice.graphql.repository;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import deba.practice.graphql.beans.Property;
import deba.practice.graphql.beans.StayDateMeasure;

@Component
public class StayDateMeasureRepository {

    public StayDateMeasure getStayDateMeasures(Property property,String start,String end) {
        // TODO Auto-generated method stub
        System.out.println(start);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer Goes here");

        String url = "url goes here";
        HttpEntity<String> request = new HttpEntity<String>(headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<StayDateMeasure> response = restTemplate.exchange(url + property.getUnit_uuid()+"?beginDate="+start+"&endDate="+end, HttpMethod.GET,
                    request, StayDateMeasure.class);
        return response.getBody();

    }
}
