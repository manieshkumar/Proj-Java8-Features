package com.java8.preDefined.Functional.Interface;

import java.util.function.Consumer;

/*interface Consumer<T>{
	void accept(T t);
}
*/
public class ConsumerFunctionalInterface {

	public static void main(String[] args) {
		
		Consumer<String> c=s->System.out.println(s);
		c.accept("hello");
	}
}
