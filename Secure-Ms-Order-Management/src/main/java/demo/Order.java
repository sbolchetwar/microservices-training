package demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
	private Long id;
	private String name;
	private Float amount;
	public Order(Long id, String name, Float amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

}
