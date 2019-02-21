package demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@RabbitListener(queues="${mq.rabbitmq.queue}")
    public void recievedMessage(String msg) {
        System.out.println("Recieved Message from Queue: " + msg);
    }
}
