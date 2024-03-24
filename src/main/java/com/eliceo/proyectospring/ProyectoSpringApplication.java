package com.eliceo.proyectospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Hemos de poner esta línea para que detecte el componente que se desea escanear.
@ComponentScan("com.eliceo.controller")

@SpringBootApplication
public class ProyectoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringApplication.class, args);
	}

}
