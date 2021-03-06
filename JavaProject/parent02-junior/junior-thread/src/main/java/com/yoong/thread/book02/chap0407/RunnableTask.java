package com.yoong.thread.book02.chap0407;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RunnableTask implements Runnable {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    private String name;

    public RunnableTask() {
    }

    public RunnableTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        String greet = "Hello, " + name + " —— " + format.format(new Date());
        System.out.println(greet);
    }
}
