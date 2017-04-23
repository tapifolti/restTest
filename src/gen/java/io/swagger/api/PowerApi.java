package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PowerApiService;
import io.swagger.api.factories.PowerApiServiceFactory;

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

@Path("/power")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the power API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-23T16:16:39.670Z")
public class PowerApi  {
   private final PowerApiService delegate = PowerApiServiceFactory.getPowerApi();

    @GET
    @Path("/{index}")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns the index-th power of the parameter", response = Integer.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "calculated power", response = Integer.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Integer.class, responseContainer = "List") })
    public Response powerOfIndex(@ApiParam(value = "index-th power",required=true) @PathParam("index") Integer index
,@ApiParam(value = "number to calculate power of") @QueryParam("number") Integer number
,@ApiParam(value = "list of numbers to calculate power of") @QueryParam("numbers") List<Integer> numbers
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.powerOfIndex(index,number,numbers,securityContext);
    }
}
