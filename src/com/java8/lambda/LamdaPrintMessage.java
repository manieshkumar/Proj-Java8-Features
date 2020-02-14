package com.java8.lambda;

interface I2{
	public String msg(String message);
}
public class LamdaPrintMessage {

	public static void main(String[] args) {
		
		I2 mssg=(message)-> message;
		
		System.out.println(mssg.msg("hello"));
	} 
}
