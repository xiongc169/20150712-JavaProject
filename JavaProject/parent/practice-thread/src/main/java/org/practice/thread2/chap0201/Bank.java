package org.practice.thread2.chap0201;

public class Bank implements Runnable {

	private Account account;

	public Bank(Account account) {
		this.account = account;
	}

	public void run() {

		for (int i = 0; i < 100; i++) {
			account.substractAmount(1000);
		}
	}

}
