package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerApplication.class, args);
	}
	
	
	
//   @Value("${message:hello}")
//    private String message;
//
//    @Bean
//    CommandLineRunner getRunner(ApplicationContext ctx)
//    {
//        return args->{
//            System.out.println(message);
//        };
//    }

}
