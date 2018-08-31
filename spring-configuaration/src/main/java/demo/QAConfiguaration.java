package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class QAConfiguaration {
	
	public QAConfiguaration() {
			this.setMessage("");
			this.setNumber(0);
			this.setValue(false);
			System.out.println("\n\n\n QAConfiguaration Initiated \n\n\n");
	}
	private String message;
    private int number;
	private boolean value;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = "Welcome - From QA";
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = 400;
	}
	public boolean isValue() {
		return value;
	}
	public void setValue(boolean value) {
		this.value = false;
	}
}
