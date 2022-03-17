package com.generation.ecommobile.configuration;

import  org.springframework.context.annotation.Bean;
import  org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	
	  @Bean
	  public OpenAPI springShopOpenAPI() {
		  Contact contato = new Contact();
		  
		  contato.setEmail("marcelo.barboza@generation.org");
		  contato.setName("Marcelo Barboza");
		  contato.setUrl("https://github.com/Marcelo7211");
		  contato.addExtension("Area", "C&I (Especialista tecnico Generation Brasil)");
		  contato.addExtension("Telefone", "+55 13 99125-1961");
		  
	      return new OpenAPI()
	              .info(new Info().title("Ecommerce Mobile")
	              .description("API para gerenciar dados do projeto integrador mobile")
	              .version("v0.0.1").contact(contato)
	              .license(new License().name("Generation.org").url("generationbrazil.org")))
	              .externalDocs(new ExternalDocumentation()
	              .description("Marcelo Barboza")
	              .url("marcelo.barboza@generation.org"));
	  }
}