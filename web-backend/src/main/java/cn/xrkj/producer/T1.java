package cn.xrkj.producer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class T1 {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(){
        Message message=new Message("hello".getBytes(),new MessageProperties());
        rabbitTemplate.convertAndSend("MY_DIRECT_EXCHANGE","FirstKey",message);
    }
}
