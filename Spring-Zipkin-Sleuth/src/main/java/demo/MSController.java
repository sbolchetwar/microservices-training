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
 
     
    private static final Logger LOG = LogManager.getLogger(MSController.class);//getLogger(ZipkinController.class.getName());
     
    @GetMapping(value="/service1")
    public String microService1()
    {
        LOG.info("Inside MicroService 1..");
         
         String response = (String) restTemplate.exchange("http://localhost:8082/service2",
                        HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();
        return "Hi...";
    }
}

