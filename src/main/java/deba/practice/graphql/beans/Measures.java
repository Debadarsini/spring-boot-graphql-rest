package deba.practice.graphql.beans;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
class Measures {
    @JsonProperty("365_days")
    private float yearly;
    @JsonProperty("180_days")
    private float halfYearly;
    @JsonProperty("90_days")
    private float qurterly;
    @JsonProperty("30_days")
    private float monthly;

}
