package io.swagger.api.factories;

import io.swagger.api.PowerApiService;
import io.swagger.api.impl.PowerApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-23T16:16:39.670Z")
public class PowerApiServiceFactory {
    private final static PowerApiService service = new PowerApiServiceImpl();

    public static PowerApiService getPowerApi() {
        return service;
    }
}
