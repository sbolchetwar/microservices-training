package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellFeignController {
	
	@Autowired
	HelloProxy proxy;
	
	@RequestMapping("/{schoolname}")
	public List hello(@PathVariable String schoolname){
		return proxy.getMsg(schoolname);
	}

}
