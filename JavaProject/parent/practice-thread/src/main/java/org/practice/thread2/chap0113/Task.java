package org.practice.thread2.chap0113;

public class Task implements Runnable {

	public void run() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
