package demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       /* auth.inMemoryAuthentication()
                .withUser("ajay").password("{noop}test").roles("USER").and()
                .withUser("demo").password("{noop}test2").roles("ADMIN");*/
    	auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
        .withUser("test").password("test123").roles("USER").and()
        .withUser("test1").password("test123").roles("ADMIN");
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
