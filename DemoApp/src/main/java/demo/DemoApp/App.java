package demo.DemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@RestController
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    /*@RequestMapping("/")
    public String home() {
    	return "Welcome to Spring Boot Demo App with Maven";
    }*/
    
}
