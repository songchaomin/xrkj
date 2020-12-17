package cn.xrkj.consumer;

import cn.xrkj.utils.RabbitMqUtil;
import com.rabbitmq.client.*;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.MediaSize;
import java.io.IOException;

@Service
public class RabbitCounsumer implements MessageListener {
    /*public static void main(String[] args) {
        Connection connection = RabbitMqUtil.getConnectionFactory();
        try {
            Channel channel = connection.createChannel();
            channel.queueDeclare("xrkj",true,false,false,null);
            channel.basicConsume("xrkj",false,new DefaultConsumer(channel){
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String content=new String(body);
                    System.out.println(content);
                    System.out.println(envelope.getDeliveryTag());
                    channel.basicAck(envelope.getDeliveryTag(),false);
                }
            });

            //channel.close();
            //connection.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/

    @Override
    public void onMessage(Message message) {
        System.out.println(new String(message.getBody()));
    }

}
