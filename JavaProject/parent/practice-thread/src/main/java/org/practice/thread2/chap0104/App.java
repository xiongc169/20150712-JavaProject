package org.practice.thread2.chap0104;

public class App {

	public static void main(String[] args) {

		PrimeTask primeTask = new PrimeTask(1);
		Thread primeThread = new Thread(primeTask);
		primeThread.start();

		System.out.println("Main Ending");
	}

}