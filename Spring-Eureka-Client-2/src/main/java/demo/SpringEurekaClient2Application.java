package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClient2Application.class, args);
	}
}
