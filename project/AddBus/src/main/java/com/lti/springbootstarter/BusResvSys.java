package com.lti.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.lti"})
@EntityScan(basePackages = "com.lti")
public class BusResvSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Busapi, args);

	}

}
