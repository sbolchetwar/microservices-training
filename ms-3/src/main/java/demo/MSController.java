package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class MSController{
	
	@Autowired
	RestTemplate restTemplate;
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	private static final Logger LOG = LogManager.getLogger(MSController.class.getName());
	
	@GetMapping(value="/service3")
	public String msService() {
		LOG.info("Inside MicroService 3..");
		String response = (String) restTemplate.exchange("http://localhost:8084/service4", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
        }).getBody();
		return "Hi...";
	}
}
