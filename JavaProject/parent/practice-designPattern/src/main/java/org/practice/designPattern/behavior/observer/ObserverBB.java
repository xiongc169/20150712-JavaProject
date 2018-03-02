package org.practice.designPattern.behavior.observer;

public class ObserverBB extends Observer {

	public ObserverBB(Subject sub) {
		this.theSubject = sub;
		this.theSubject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("this is ObserverBB");
	}

}
