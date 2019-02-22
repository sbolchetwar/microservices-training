package demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginManagementResource {

	@GetMapping(value = "/login")
	public String login(HttpServletRequest request, HttpSession session) {
		/*
		 * create new session if session is not new
		 */
		if (!session.isNew()) {
			session.invalidate();
		}
		return "login";
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test Successfull";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "Test2 Successfull in gateway service";
	}


	@GetMapping("/logout")
	public String logout() {
		return "redirect:/login";
	}
}
