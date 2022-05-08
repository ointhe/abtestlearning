package com.isfactory.abtestlearning;

import org.apache.commons.codec.binary.Base64;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration;

@SpringBootApplication
public class AbtestlearningApplication {

	public static void main(String[] args) {
		String credentials = "foo:bar";
		String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));
		System.out.println(encodedCredentials);
		SpringApplication.run(AbtestlearningApplication.class, args);
	}


}
