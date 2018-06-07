package deba.practice.graphql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import deba.practice.graphql.beans.Destination;
import deba.practice.graphql.beans.Property;
import deba.practice.graphql.beans.PropertyQuery;
import deba.practice.graphql.beans.StayDateMeasure;
import deba.practice.graphql.repository.DestinationRepository;
import deba.practice.graphql.repository.StayDateMeasureRepository;

@Component
public class PropertyQueryResolver implements GraphQLResolver<Property> {
    
    @Autowired
    private DestinationRepository destinationRepository;
    
    @Autowired
    private StayDateMeasureRepository stayDateMeasureRepository;

    public List<Destination> getDestinations(Property property) {
        return destinationRepository.findBySearchTermUiId(property);
    }
    
    public StayDateMeasure getStayDateMeasures(Property property,String startDate,String endDate) {
        return stayDateMeasureRepository.getStayDateMeasures(property,startDate,endDate);
    }
}
