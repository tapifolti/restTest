package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FactorialApiService;
import io.swagger.api.factories.FactorialApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Error;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/factorial")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the factorial API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-23T16:16:39.670Z")
public class FactorialApi  {
   private final FactorialApiService delegate = FactorialApiServiceFactory.getFactorialApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns the factorial of the parameter", response = Integer.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "calculated factorial", response = Integer.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Integer.class, responseContainer = "List") })
    public Response factorialOf(@ApiParam(value = "number to calculate factorial of") @QueryParam("number") Integer number
,@ApiParam(value = "list of numbers to calculate factorial of") @QueryParam("numbers") List<Integer> numbers
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.factorialOf(number,numbers,securityContext);
    }
}
