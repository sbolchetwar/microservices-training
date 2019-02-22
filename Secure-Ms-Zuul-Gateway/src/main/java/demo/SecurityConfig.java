package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

   /* @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    }*/
	
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        	auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
	        .withUser("user").password("user").roles("USER").and()
	        .withUser("admin").password("admin").roles("ADMIN");
	    }

	    @Override
	    protected void configure(HttpSecurity httpSecurity) throws Exception {

	        httpSecurity
	                .authorizeRequests()
	                .anyRequest()
	                .fullyAuthenticated()
	                .and()
	                .httpBasic();
	        httpSecurity.csrf().disable();

	    }
}
