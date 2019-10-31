package org.practice.thread.thread02.ch11countdownlatch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Semaphore;

/**
 * Java并发编程：CountDownLatch、CyclicBarrier和Semaphore
 * http://www.cnblogs.com/dolphin0520/p/3920397.html
 *
 * @author Administrator
 */
public class MySemaphore {

    /**
     * 入口函数
     *
     * @param args
     */
    public static void main(String[] args) {
        try {

            Semaphore semaphore = new Semaphore(3);
            for (int i = 0; i < 9; i++) {
                MyThread myThread = new MyThread(i, semaphore);
                myThread.start();
            }

            System.out.println(Thread.currentThread().getId() + " " + Thread.currentThread().getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class MyThread extends Thread {

    private int num;

    private Semaphore semaphore;

    private DateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public MyThread() {
    }

    public MyThread(int num, Semaphore se) {
        this.num = num;
        this.semaphore = se;
    }

    public void run() {
        try {
            semaphore.acquire();
            System.out.println(dt.format(new Date()) + " " + num + " Begin... " + Thread.currentThread().getId());
            Thread.sleep(4000);
            System.out.println(dt.format(new Date()) + " " + num + " End! " + Thread.currentThread().getId());
            semaphore.release();
        } catch (InterruptedException e) {
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }

}