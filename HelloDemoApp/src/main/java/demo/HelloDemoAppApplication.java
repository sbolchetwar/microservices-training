package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDemoAppApplication.class, args);
	}
	
	@RequestMapping("/test")
	public String hello() {
		return "Hello world";
	}
}
