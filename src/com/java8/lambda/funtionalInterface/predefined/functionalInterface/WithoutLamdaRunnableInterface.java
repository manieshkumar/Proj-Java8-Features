package com.java8.lambda.funtionalInterface.predefined.functionalInterface;

public class WithoutLamdaRunnableInterface implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("child thread");
		}

	}

	public static void main(String[] args) {
		Runnable r = new WithoutLamdaRunnableInterface();
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main thread");
		}

	}
}
