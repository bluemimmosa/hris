package com.synergyani.hris;

import java.security.SecureRandom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class HrisApplication {

	public static void main(String[] args) {
//            BCryptPasswordEncoder bCryptPasswordEncoder =
//  new BCryptPasswordEncoder();
// String encodedPassword = bCryptPasswordEncoder.encode("niraj");
//            System.out.println(encodedPassword);
		SpringApplication.run(HrisApplication.class, args);
	}

}
