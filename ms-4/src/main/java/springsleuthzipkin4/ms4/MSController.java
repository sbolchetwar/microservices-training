package springsleuthzipkin4.ms4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class MSController {

	@Autowired
	RestTemplate restTemplate;

	

	private static final Logger LOG = LogManager.getLogger(MSController.class.getName());

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@GetMapping(value = "/service4")
	public String msService() {
		LOG.info("Inside MicroService 4..");
		return "Hi...";
	}
}
