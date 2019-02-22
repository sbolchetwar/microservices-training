package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWebSecurity
@EnableRedisHttpSession
@RestController
public class SecureMsOrderManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureMsOrderManagementApplication.class, args);
	}
//	@GetMapping("/orders")
//	public List<Order> getOrders() {
//		List<Order> oList =  new ArrayList<Order>();
//		oList.add(new Order(1L, "Sandeep", 25.4F));
//		oList.add(new Order(2L, "Suresh", 35.4F));
//		oList.add(new Order(3L, "Ramesh", 45.4F));
//		return oList;
//
//	}
	@GetMapping("/orders")
	public String getOrders() {
		return "This is msg from ORDER-SERVICE... responce time :"+new Date();

	}

}
