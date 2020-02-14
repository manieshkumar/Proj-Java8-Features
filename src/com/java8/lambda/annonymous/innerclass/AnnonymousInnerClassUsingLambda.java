package com.java8.lambda.annonymous.innerclass;

public class AnnonymousInnerClassUsingLambda {

	public static void main(String[] args) {

		/*
		 * Runnable r = () -> { for (int i = 0; i <= 10; i++) {
		 * System.out.println("child thread"); }
		 * 
		 * }; Thread t = new Thread(r); t.start(); for (int i = 0; i <= 10; i++) {
		 * System.out.println("main thread"); }
		 */

		Thread t = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("child thread");
			}
		});
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("main thread");
		}
	}
}
