package deba.practice.graphql.beans;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Property {

    Float bathroom_num;
    Float bedroom_num;
    String property_contact_city;
    String unit_uuid;
    String destinationId;
    public String getUnit_uuid() {
        return unit_uuid;
    }
    public void setUnit_uuid(String unit_uuid) {
        this.unit_uuid = unit_uuid;
    }
    public String getDestinationId() {
        return destinationId;
    }
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    
}


