package org.practice.primary.book02.chap03;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Desc 《Java核心技术·卷2·高级特性·第9版》第三章、网络
 * @Author
 * @Date
 * @Version 1.0
 */
public class AppNetwork {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * IP地址132.163.4.103
     */
    public static String cesiumClockIP = "time-A.timefreq.bldrdoc.gov";
    public static Integer cesiumClockPort = 13;

    public static String horstmannIP = "horstmann.com";
    public static Integer horstmannPort = 80;

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        try {
            //连接到铯原子钟
            connectServer0301();
            inetAddress0301();

            String json = "{\"appId\":\"ftcs-test\",\"body\":\"BYprHoNf7CPKJ32xhe6BUoC+QUJkGnKwU46Wp8z4VsaWg/2Sixam5fVMZ41Q/wKPB5AH8ZbPXwtIbHJUNNhGYiG3GG76z4MCOlvR8FmzrRgzFRstOEK2C5LQ8/uZNKwUGx2pIwaSOv3xuKjnzgwZ5WmFD7MUqhRN4I+jRc2IsDQ=\",\"sequenceId\":\"2020-05-26 16:41:46\",\"sign\":\"4478c43f955a752a8836ae4282b06752\"}";
            String result = EContractUtils.sendPostRequestJSON("http://192.168.27.21:9853/api/v1/getTemplateList", json);
            System.out.println(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 3.1、连接到铯原子钟
     */
    public static void connectServer0301() throws Exception {
        System.out.println(format.format(new Date()));
        Socket socket = new Socket(cesiumClockIP, cesiumClockPort);
        //防止可读超时
        //socket.setSoTimeout(15000);
        //防止连接超时
        //socket.connect(new InetSocketAddress(horstmannIP, horstmannPort), 1000);
        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        int lineNum = 1;
        while (scanner.hasNextLine()) {
            System.out.printf("Line-%d  %s\n", lineNum++, scanner.nextLine());
        }
        System.out.println(format.format(new Date()));
    }

    /**
     * 3.1.2、英特网地址
     */
    public static void inetAddress0301() throws Exception {
        InetAddress inetAddress = InetAddress.getByName(cesiumClockIP);
        System.out.println(inetAddress);
        InetAddress[] inetAddresses = InetAddress.getAllByName("www.baidu.com");
        System.out.println(inetAddresses.length);
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
    }
}
