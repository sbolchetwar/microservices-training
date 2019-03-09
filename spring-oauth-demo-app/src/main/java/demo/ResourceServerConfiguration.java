package demo;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableResourceServer
@RestController
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter
{
	  @RequestMapping("/public")
	  public String publicAccess() {
	    return "Page Public accessible with out authentication";
	  }
	  @RequestMapping("/private")
	  public String privateAccess() {
	    return "Page private accessible by authenticated user";
	  }
	  @RequestMapping("/admin")
	  public String admin() {
	    return "Page Administrator accessible by authenticated admin user";
	  }
	  @Override
		public void configure(HttpSecurity http) throws Exception {
			http
			.authorizeRequests().antMatchers("/oauth/token", "/oauth/authorize**", "/public").permitAll();
//			 .anyRequest().authenticated();
			http.requestMatchers().antMatchers("/private")
			.and().authorizeRequests()
			.antMatchers("/private").access("hasRole('USER')")
			.and().requestMatchers().antMatchers("/admin")
			.and().authorizeRequests()
			.antMatchers("/admin").access("hasRole('ADMIN')");
		}   

}
