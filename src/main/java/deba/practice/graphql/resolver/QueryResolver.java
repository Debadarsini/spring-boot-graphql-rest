package deba.practice.graphql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import deba.practice.graphql.beans.Property;
import deba.practice.graphql.beans.PropertyQuery;
import deba.practice.graphql.repository.PropertyRepository;

@Component
public class QueryResolver  implements GraphQLQueryResolver{
    
    @Autowired
    PropertyRepository propertyRepository;
   
    public Property getProperty(String unit_uuid) {
        PropertyQuery propertyQuery = new PropertyQuery();
        propertyQuery.setUnit_uuid(unit_uuid);
        return propertyRepository.findByUnitUuid(propertyQuery).get(0);
    }
    
    public List<Property> getPropertyByExample(PropertyQuery propertyQuery) {
        return propertyRepository.findByUnitUuid(propertyQuery);
    }

}
