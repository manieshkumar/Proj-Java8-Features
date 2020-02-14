package com.method.refernce.and.constuctor.reffernce;

public class MethodRefferenceRunableInterface {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child Thread");
		}

	}

	public static void main(String[] args) {

		MethodRefferenceRunableInterface mri = new MethodRefferenceRunableInterface();
		Runnable r = mri::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}
}
