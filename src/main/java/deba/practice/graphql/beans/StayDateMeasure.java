package deba.practice.graphql.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class StayDateMeasure {
    String unit_uuid;
    StayDateSupply supply;
}


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
class StayDateSupply {
    StayDateMeasureSupplyAggregates aggregate;
}

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
class StayDateMeasureSupplyAggregates {
    int available_night;
    int blocked_night;
    int reserved_night;
    int min_stay_blocked_night;
    float lodging_nightly_rate_usd;
}
