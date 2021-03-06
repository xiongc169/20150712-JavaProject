package com.yoong.activemq.activemq2.P2P;

import javax.jms.DeliveryMode;
import javax.jms.MapMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * @Desc 深入浅出消息队列 ActiveMQ
 * PS：使用JMS方式发送接收消息
 * http://blog.csdn.net/jwdstef/article/details/17380471
 * <p>
 * @Author yoong
 * <p>
 * @Date 2015-08-28 09:55:26
 * <p>
 * @Version 1.0
 */
public class QueueSender {

    /**
     * 发送次数
     */
    public static final int SEND_NUM = 5;

    /**
     * tcp 地址
     */
    public static final String BROKER_URL = "tcp://localhost:61616";

    /**
     * 目标，在ActiveMQ管理员控制台创建 http://localhost:8161/admin/queues.jsp
     */
    public static final String DESTINATION = "hoo.mq.queue";

    /**
     * 入口函数
     */
    public static void main(String[] args) throws Exception {
        try {
            QueueSender.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void run() throws Exception {
        QueueConnectionFactory queueConnectionFactory = null;
        QueueConnection queueConnection = null;
        QueueSession queueSession = null;
        Queue queue = null;
        javax.jms.QueueSender sender = null;
        try {
            // 创建链接工厂
            queueConnectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD, BROKER_URL);
            // 通过工厂创建一个连接
            queueConnection = queueConnectionFactory.createQueueConnection();
            // 启动连接
            queueConnection.start();
            // 创建一个session会话
            queueSession = queueConnection.createQueueSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            // 创建一个消息队列
            queue = queueSession.createQueue(DESTINATION);
            // 创建消息发送者
            sender = queueSession.createSender(queue);
            // 设置持久化模式
            sender.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            sendMessage(queueSession, sender);
            // 提交会话
            queueSession.commit();
        } catch (Exception e) {
            throw e;
        } finally {
            // 关闭释放资源
            if (queueSession != null) {
                queueSession.close();
            }
            if (queueConnection != null) {
                queueConnection.close();
            }
        }
    }

    public static void sendMessage(QueueSession session, javax.jms.QueueSender sender) throws Exception {
        for (int i = 0; i < SEND_NUM; i++) {
            String message = "发送消息第" + (i + 1) + "条";

            MapMessage map = session.createMapMessage();
            map.setString("text", message);
            map.setLong("time", System.currentTimeMillis());
            System.out.println(map);

            sender.send(map);
        }
    }
}
