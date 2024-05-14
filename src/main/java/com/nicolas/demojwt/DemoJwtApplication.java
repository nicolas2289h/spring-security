package com.nicolas.demojwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJwtApplication.class, args);
	}
}
// AGREGAR EN LA BASE DE DATOS
// INSERT INTO role (name) VALUES ('ARTISTA');
// INSERT INTO role (name) VALUES ('PRODUCTOR');

// POSTMAN
//{
//		"username": "nicolas",
//		"password": "123456",
//		"firstname": "Nombre",
//		"lastname": "Apellido",
//		"country": "Argentina",
//		"roles": ["PRODUCTOR"]
//		}
