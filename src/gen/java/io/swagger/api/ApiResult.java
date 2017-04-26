package io.swagger.api;

/**
 * Created by tapifolti on 4/26/2017.
 */
import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResult {

    private Float[] results;

    public ApiResult() {
        // Jackson deserialization
    }

    public ApiResult(Float[] results) {
        this.results = results;
    }

    @JsonProperty
    public Float[] getResults() {
        return results;
    }
}