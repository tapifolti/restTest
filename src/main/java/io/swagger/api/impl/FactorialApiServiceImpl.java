package io.swagger.api.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Error;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;
import java.util.function.Function;
import java.util.stream.IntStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import com.fasterxml.jackson.databind.ObjectMapper;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-26T13:33:48.390Z")
public class FactorialApiServiceImpl extends FactorialApiService implements Function<Integer, Float> {

    ObjectMapper mapper = new ObjectMapper();

    public Float apply(Integer number) {
        Double result = IntStream.iterate(1, i -> i+1).limit(number).mapToDouble(x -> x).reduce((z,y) -> z*y).getAsDouble();
        return new Float(result);
    }

    @Override
    public Response factorialOf( Integer number,  List<Integer> numbers, SecurityContext securityContext) throws NotFoundException {

        Float[] results = null;
        if (numbers != null && numbers.size() > 0){
            results = numbers.stream().map(this::apply).toArray(Float[]::new);
        } else if (number != null) {
            results = new Float[1];
            results[0] = apply(number);
        }
        ApiResult apiResult = new ApiResult(results);
        String resultJson = "";
        try {
            resultJson = mapper.writeValueAsString(apiResult);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, resultJson)).build();
    }
}
