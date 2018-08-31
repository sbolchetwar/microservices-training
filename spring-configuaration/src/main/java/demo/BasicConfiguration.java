package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("basic")
public class BasicConfiguration {
	
	private String message;
    private int number;
	private boolean value;
	
    public boolean isValue() {
		return value;
	}
	public void setValue(boolean value) {
		this.value = value;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
    
}
