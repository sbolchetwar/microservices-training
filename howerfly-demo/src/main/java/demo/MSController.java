package demo;

import java.util.Date;
import java.util.UUID;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MSController {

	@RequestMapping(value = "/service/hoverfly")
    public HoverflyServiceResponse getSampleResponse() {
        System.out.println("Inside HoverflyActualServiceApplication::getSampleResponse()");
        return new HoverflyServiceResponse("returned value from HoverflyActualServiceApplication", new Date().toString(), UUID.randomUUID().toString());
    }
	
}
