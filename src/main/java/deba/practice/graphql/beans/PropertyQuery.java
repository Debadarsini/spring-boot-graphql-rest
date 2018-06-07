package deba.practice.graphql.beans;

import java.util.ArrayList;
import java.util.List;

public class PropertyQuery {

    Float bathroom_num;
    Float bedroom_num;
    
    String unit_uuid;
    
    
    public String getUnit_uuid() {
        return unit_uuid;
    }
    public void setUnit_uuid(String unit_uuid) {
        this.unit_uuid = unit_uuid;
    }
    public Float getBathroom_num() {
        return bathroom_num;
    }
    public void setBathroom_num(Float bathroom_num) {
        this.bathroom_num = bathroom_num;
    }
    public Float getBedroom_num() {
        return bedroom_num;
    }
    public void setBedroom_num(Float bedroom_num) {
        this.bedroom_num = bedroom_num;
    }
    
    @Override
    public String toString() {
    //Form your query here    
         List<String> queries = new ArrayList<String>();
         if(bathroom_num!=null)
             queries.add("bathroom_num="+bathroom_num);
         if(bedroom_num!=null)
             queries.add("bedroom_num="+bedroom_num);
        
       
        return String.join("&", queries);
    }
 
    
    
        
}
