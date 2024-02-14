package com.mayatech.sebocabank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Seboca bank api",
				description = "Backend Rest APIs for Seboca Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Oussoufi Camara",
						email = "camoussfi@gmail.com",
						url = "https://github.com/camoussfi/seboca_bank"
				),
				license = @License(
						name = "Seboca Tech",
						url = "https://github.com/camoussfi/seboca_bank"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Seboca Tech Bank App Documentation",
				url = "https://github.com/camoussfi/seboca_bank"
		)
)
public class SebocaBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(SebocaBankApplication.class, args);
	}

}
