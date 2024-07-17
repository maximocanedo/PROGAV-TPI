package frgp.utn.edu.ar.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("frgp.utn.edu.ar")
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
