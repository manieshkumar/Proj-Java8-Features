package com.java8.lambda;

interface I3{
	
	public void message();
}

public class PringtMessage {
	public static void main(String[] args) {
	
		I3 message=()->System.out.println("hello hi!...");
		message.message();
	}

	
}
