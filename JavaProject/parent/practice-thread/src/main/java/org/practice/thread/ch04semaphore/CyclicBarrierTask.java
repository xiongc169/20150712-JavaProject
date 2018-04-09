package org.practice.thread.ch04semaphore;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTask implements Runnable {

	private CyclicBarrier barrier;

	public CyclicBarrierTask(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	public void run() {
		System.out.printf("%s Start \n", Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
			barrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.printf("%s End \n", Thread.currentThread().getName());
	}
}