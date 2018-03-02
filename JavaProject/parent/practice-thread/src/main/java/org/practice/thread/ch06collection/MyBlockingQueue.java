package org.practice.thread.ch06collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 阻塞队列： http://www.cnblogs.com/dolphin0520/p/3932906.html
 * 
 * @author Administrator
 *
 */
public class MyBlockingQueue {

	public static void main(String[] args) {

		// 常见阻塞队列
		ArrayBlockingQueue arrayQueue = new ArrayBlockingQueue(10);
		LinkedBlockingQueue linkedQueue = new LinkedBlockingQueue();
		PriorityBlockingQueue priorityQueue = new PriorityBlockingQueue();
		DelayQueue delayQueue = new DelayQueue();
		SynchronousQueue synchronousQueue = new SynchronousQueue();

		// 常见线程池及其构造函数
		ExecutorService single = Executors.newSingleThreadExecutor();
		ExecutorService singleConstructor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>());

		ExecutorService fixed = Executors.newFixedThreadPool(10);
		ExecutorService fixedConstructor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>());

		ExecutorService cache = Executors.newCachedThreadPool();
		ExecutorService cacheConstructor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS,
				new SynchronousQueue<Runnable>());

	}

}
