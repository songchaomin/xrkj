package cn.xrkj.producer;

import cn.xrkj.consumer.RabbitCounsumer;
import cn.xrkj.utils.RabbitMqUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Consumer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeoutException;

public class RabbitProducer {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
        T1 t1 = (T1) context.getBean(T1.class);
        t1.sendMessage();
        System.out.println(t1);




       /* Connection connection = RabbitMqUtil.getConnectionFactory();
        try {
            Channel channel = connection.createChannel();
            channel.queueDeclare("xrkj",true,false,false,null);
            channel.basicPublish("","xrkj",null,("i am rabbitmq "+new Date().toString()).getBytes());
            channel.close();
            connection.close();
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }*/

    }
}
