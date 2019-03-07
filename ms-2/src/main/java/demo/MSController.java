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
	
	@GetMapping(value="/service2")
	public String msService() {
		LOG.info("Inside MicroService 2..");
		LOG.info("Now let's create some intentional delay...");
		try {
			Thread.sleep(20 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOG.info("returning after delay..");
		String response = (String) restTemplate.exchange("http://localhost:8083/service3", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
        }).getBody();
		return "Hi...";
	}
}

