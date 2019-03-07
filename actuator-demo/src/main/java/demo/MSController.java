package demo;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class MSController {
	
	@GetMapping("/actuator-demo")
    public String example() {
        return "Welcomet to Actuator demo app " + new Date();
    }

}
