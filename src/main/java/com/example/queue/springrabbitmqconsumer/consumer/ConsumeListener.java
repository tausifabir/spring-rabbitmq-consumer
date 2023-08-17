package com.example.queue.springrabbitmqconsumer.consumer;

import com.example.queue.springrabbitmqconsumer.CustomMessage;
import com.example.queue.springrabbitmqconsumer.MQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeListener {

  @RabbitListener(queues = MQConfig.MESSAGE_QUEUE)
  public void listener(CustomMessage message){
    System.out.println(message);
  }
}
