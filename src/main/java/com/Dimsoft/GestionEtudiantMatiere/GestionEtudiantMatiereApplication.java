package com.Dimsoft.GestionEtudiantMatiere;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootApplication
public class GestionEtudiantMatiereApplication {

	// AuthenticationManager authenticationManager;

	// UserDetailsService userDetailsService;

	public static void main(String[] args) {
		SpringApplication.run(GestionEtudiantMatiereApplication.class, args);
		System.out.println("hello Lionpro !!!");
	}

}
