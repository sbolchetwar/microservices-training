package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@SpringBootApplication
public class SpringCfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCfApplication.class, args);
	}
	
	@RestController
	class MessageRestController {
	 
	    @RequestMapping("/hello")
	    String getMessage(@RequestParam(value = "name") String name) {
	        String rsp = "Hi " + name + " : responded on - " + new Date();
	        System.out.println(rsp);
	        return rsp;
	    }
	}
	
}
