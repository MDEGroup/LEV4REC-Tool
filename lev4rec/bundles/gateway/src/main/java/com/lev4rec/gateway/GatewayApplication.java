package com.lev4rec.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		 return builder.routes()
			        .route(p-> p.path("/lev4rec/").and().method("GET")
			            .filters(f-> f.rewritePath("/lev4rec/","/lev4rec/"))
			            .uri("http://localhost:8888"))
			        
			        .route(p-> p.path("/lev4rec/").and().method("POST")
				            .filters(f-> f.rewritePath("/lev4rec/","/lev4rec/"))
				            .uri("http://localhost:8888"))
			        
			        .route(p-> p.path("/lev4rec/dsl").and().method("GET")
				            .filters(f-> f.rewritePath("/lev4rec/dsl","/lev4rec/dsl/"))
				            .uri("http://localhost:8888"))
			        
			        .route(p-> p.path("/lev4rec/dsl").and().method("POST")
				            .filters(f-> f.rewritePath("/lev4rec/dsl/","/lev4rec/dsl/"))
				            .uri("http://localhost:8888"))
			        
			        .route(p-> p.path("/lev4rec/generate").and().method("GET")
				            .filters(f-> f.rewritePath("/lev4rec/generate","/lev4rec/generate"))
				            .uri("http://localhost:8888"))
			        
			        .route(p->p.path("/lev4rec/webjars/requirejs/2.3.6/require.min.js")
			        		.filters(f-> f.rewritePath("/lev4rec/dsl","/lev4rec/dsl"))
			        		.uri("http://localhost:8888"))
			        
			        
			        .route(p->p.path("/lev4rec/css/xtext-ace.css")
			        		.filters(f-> f.rewritePath("/lev4rec/","/lev4rec/"))
			        		.uri("http://localhost:8888"))
			        
			        .route(p->p.path("/lev4rec/css/style.css")
			        		.filters(f-> f.rewritePath("/lev4rec/","/lev4rec/"))
			        		.uri("http://localhost:8888"))		        
			        
			        
			        
			        .route(p->p.path("/lev4rec/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css/")
			        		.filters(f-> f.rewritePath("/lev4rec/","/lev4rec/"))
			        		.uri("http://localhost:8888"))
			        
			        
			        .route(p->p.path("lev4rec/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css/bootstrap.min.css.map/")
			        		.filters(f-> f.rewritePath("/lev4rec/","/lev4rec/"))
			        		.uri("http://localhost:8888"))
			        
			        .route(p->p.path("/lev4rec/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js")
			        		.filters(f-> f.rewritePath("/lev4rec/","/lev4rec/"))
			        		.uri("http://localhost:8888"))
			        
			        
			        .route(p->p.path("/lev4rec/js/xtext-ace.js")
			        		.filters(f-> f.rewritePath("/lev4rec/","/lev4rec/"))
			        		.uri("http://localhost:8888"))
			        
			        .route(p->p.path("/lev4rec/webjars/jquery/3.4.1/jquery.min.js")
			        		.filters(f-> f.rewritePath("/lev4rec/","/lev4rec/"))
			        		.uri("http://localhost:8888"))
			        
			        
			        .route(p->p.path("/lev4rec/webjars/ace/1.3.3/src/ace.js")
			        		.filters(f-> f.rewritePath("/lev4rec/dsl","/lev4rec/dsl"))
			        		.uri("http://localhost:8888"))
			        
			        .route(p->p.path("/lev4rec/webjars/ace/1.3.3/src/ext-language_tools.js")
			        		.filters(f-> f.rewritePath("/lev4rec/dsl","/lev4rec/dsl"))
			        		.uri("http://localhost:8888"))
			        
			        .route(p->p.path("/lev4rec/webjars/ace/1.3.3/src/theme-eclipse.js")
			        		.filters(f-> f.rewritePath("/lev4rec/dsl","/lev4rec/dsl"))
			        		.uri("http://localhost:8888"))
			        
			        .route(p->p.path("/lev4rec/js/mode-rec.js")
			        		.filters(f-> f.rewritePath("/lev4rec/","/lev4rec/"))
			        		.uri("http://localhost:8888"))
			        
			        .route(p->p.path("/xtext-service/update").and().method("PUT")
			        		.filters(f-> f.rewritePath("/xtext-service/update","/xtext-service/update"))
			        		.uri("http://localhost:8080"))
			        
			        .route(p->p.path("/xtext-service/validate").and().method("GET")
			        		.filters(f-> f.rewritePath("/xtext-service/validate","/xtext-service/validate"))
			        		.uri("http://localhost:8080"))
			        
			        
			        .route(p->p.path("/xtext-service/assist").and().method("GET")
			        		.filters(f-> f.rewritePath("/xtext-service/assist","/xtext-service/assist"))
			        		.uri("http://localhost:8080"))
			        
			        .route(p->p.path("/xtext-service/occurrences").and().method("GET")
			        		.filters(f-> f.rewritePath("/xtext-service/occurrences","/xtext-service/occurrences"))
			        		.uri("http://localhost:8080"))
			        
			        .route(p->p.path("/xtext-service/assist").and().method("GET")
			        		.filters(f-> f.rewritePath("/xtext-service/assist","/xtext-service/assist"))
			        		.uri("http://localhost:8080"))
			        
			        .route(p->p.path("/xtext-service/assist").and().method("POST")
			        		.filters(f-> f.rewritePath("/xtext-service/assist","/xtext-service/assist"))
			        		.uri("http://localhost:8080"))
			        
			        
			        .build();
		 
					
	}
	

}
