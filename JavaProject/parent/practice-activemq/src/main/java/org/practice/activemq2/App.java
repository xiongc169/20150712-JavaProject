package org.practice.activemq2;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description App.java
 * @author chaoxiong
 * @date 2016年7月21日 下午7:24:57
 */
public class App {

	/**
	 * @description TODO
	 * @param args
	 * @return void
	 * @author chaoxiong
	 * @date 2016年7月21日 下午7:24:57
	 */
	public static void main(String[] args) {
		try {
			ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

			// ConnectionFactory ：连接工厂，JMS 用它创建连接
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("admin", "123456", "tcp://localhost:61616");
			ConnectionFactory connectionFactory2 = (ConnectionFactory) appContext.getBean("activemqConnectionFactory");

			Connection connection = connectionFactory2.createConnection();
			// 启动
			connection.start();
			// 获取操作连接
			Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createQueue("SecondQueue");

			// 得到消息生成者【发送者】
			MessageProducer producer = session.createProducer(destination);
			// 设置不持久化，此处学习，实际根据项目决定
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			for (int i = 1; i <= 10; i++) {
				TextMessage message = session.createTextMessage("ActiveMq 发送的消息" + i);
				// 发送消息到目的地方
				System.out.println("发送消息：" + "ActiveMq 发送的消息" + i);
				producer.send(message);
			}
			session.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
