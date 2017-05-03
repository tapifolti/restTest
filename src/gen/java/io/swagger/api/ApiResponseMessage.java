package io.swagger.api;

import javax.xml.bind.annotation.XmlTransient;

@javax.xml.bind.annotation.XmlRootElement
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-26T13:33:48.390Z")
public class ApiResponseMessage {

    public ApiResponseMessage(){}
    private Float[] results;

    public ApiResponseMessage(Float[] results) {
        this.results = results;
    }

    public Float[] getResults() {
        return results;
    }

    public void setResults(Float[] results) {
        this.results = results;
    }
}
