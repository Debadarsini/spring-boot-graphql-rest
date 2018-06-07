package deba.practice.graphql.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

class ListConverter extends JsonDeserializer<Collection<String>> {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected ListConverter() {
       // super(Collection.class);
    }

    @Override
    public Collection<String> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        switch (jp.getCurrentToken()) {
            case START_OBJECT: {
                JsonDeserializer<Object> deserializer = ctxt.findRootValueDeserializer(ctxt.constructType(Map.class));
                Map<String, Float> map = (Map<String, Float>) deserializer.deserialize(jp, ctxt);
                Collection<String> cols = new ArrayList<String>();
                for(Entry<String, Float> entry : map.entrySet()) {
                    cols.add(entry.getKey()+" : "+entry.getValue());
                }
                return cols;
            }
            case START_ARRAY: {
                JsonDeserializer<Object> deserializer = ctxt.findRootValueDeserializer(ctxt.constructType(List.class));
                List<String> list = (List<String>) deserializer.deserialize(jp, ctxt);
                return list;
            }
            default:
                throw ctxt.mappingException("Expected to see an object or array, found " + jp.getCurrentToken());
        }
    }
}

