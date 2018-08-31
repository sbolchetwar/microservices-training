package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLoggAppApplication implements CommandLineRunner{
	
	private MyService myService = new MyServiceImpl();
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLoggAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		myService.doStuff("value");
		
	}
}
