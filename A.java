package com.runable;

public class A implements Runnable {
	int a = 300;
	int b = 100;
	int c;

	@Override
	public void run() {

		int c = a + b;
		System.out.println("add: "+c);

	}

}
