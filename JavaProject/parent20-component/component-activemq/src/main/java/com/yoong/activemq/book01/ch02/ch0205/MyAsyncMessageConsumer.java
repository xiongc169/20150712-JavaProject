package com.yoong.activemq.book01.ch02.ch0205;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * @Desc MyAsyncMessageConsumer
 * <p>
 * @Author yoong
 * <p>
 * @Date 2019/1/31 14:19
 * <p>
 * @Version 1.0
 */
public class MyAsyncMessageConsumer implements MessageListener {
    /**
     * 入口函数
     */
    public static void main(String[] args) {
        try {
            demo();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * chap2.5.1
     */
    private static void demo() throws Exception {
        ConnectionFactory connectionFactory;
        Connection connection = null;
        Session session = null;
        Destination destination;
        MessageProducer producer = null;
        Message message;
        boolean useTransaction = false;
        try {
            Context ctx = new InitialContext();
            connectionFactory = (ConnectionFactory) ctx.lookup("ConnectionFactoryName");
            connection = connectionFactory.createConnection();
            connection.start();
            session = connection.createSession(useTransaction,
                    Session.AUTO_ACKNOWLEDGE);
            destination = session.createQueue("TEST.QUEUE");
            MessageConsumer consumer = session.createConsumer(destination);
//            consumer.setMessageListener(this);
        } catch (JMSException jmsEx) {
        } finally {
            producer.close();
            session.close();
            connection.close();
        }

    }

    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            System.out.println("Received message: " + message);
        }
    }
}
