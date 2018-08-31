package demo.DemoApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
    public String home() {
    	return "Welcome to Spring Boot Demo App with Maven";
    }
}
