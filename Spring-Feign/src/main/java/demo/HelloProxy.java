package demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FeignClient(name="student", url="http://localhost:8098")
public interface HelloProxy {
	
	@RequestMapping(value="/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
	public List getMsg(@PathVariable String schoolname);
}
