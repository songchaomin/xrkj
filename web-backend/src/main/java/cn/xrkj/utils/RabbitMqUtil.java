package cn.xrkj.utils;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMqUtil {
    private static ConnectionFactory connectionFactory;
    static{
        connectionFactory=new ConnectionFactory();
        connectionFactory.setHost("192.168.199.155");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("admin");
        connectionFactory.setPassword("scm123");
    }

    private Connection connection;

    public static Connection getConnectionFactory(){
        Connection connection=null;
        try {
            connection= connectionFactory.newConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
