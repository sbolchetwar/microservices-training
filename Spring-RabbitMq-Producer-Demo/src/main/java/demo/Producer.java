package demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${mq.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${mq.rabbitmq.routingkey}")
	private String routingKey;
	
	public void produceMsg(String msg){
		amqpTemplate.convertAndSend(exchange, routingKey, msg);
		System.out.println("Sent msg = " + msg +"\n to Queue");
	}
}
