package com.ganesh.sarma;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SarmaApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SarmaApplication.class, args);
		openHomePage();
	}

	private static void openHomePage() throws IOException {
	       Runtime rt = Runtime.getRuntime();
	       rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080/nakshatram/ponthana");
	    }
}
