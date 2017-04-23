package io.swagger.api.factories;

import io.swagger.api.FactorialApiService;
import io.swagger.api.impl.FactorialApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-23T16:16:39.670Z")
public class FactorialApiServiceFactory {
    private final static FactorialApiService service = new FactorialApiServiceImpl();

    public static FactorialApiService getFactorialApi() {
        return service;
    }
}
