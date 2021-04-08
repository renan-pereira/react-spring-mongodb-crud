package org.openapi;

import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(info = @Info(description = "Conjunto de endpoints utilizados para quarkus", title = "Apresentação AMA Quarkus", version = "0.0.1"))
public class MinhaAplicacao extends Application{
    
}
