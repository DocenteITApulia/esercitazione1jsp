package it.apulia.esercitazione1jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Esercitazione1jspApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Esercitazione1jspApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Esercitazione1jspApplication.class, args);
	}

}
//https://www.baeldung.com/spring-boot-jsp potrebbe essere utile anche per la gestione degli errori
//ho dovuto mettere la 1.2 perchè la 2.0 dava problemi