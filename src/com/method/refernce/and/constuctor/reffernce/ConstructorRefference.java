package com.method.refernce.and.constuctor.reffernce;

interface I{
	public Sample  get();
}

public class ConstructorRefference {
	
	public static void main(String[] args) {
		
		//using lamda 
		/*
		 * I i=()->{ Sample s=new Sample(); return s; }; Sample s1=i.get();
		 */		
		
		//with construcor refernce
		//here sample clas object is getting created and return when we are writting Sample::new
		I i=Sample::new;
		Sample s1=i.get();
		
	}

}
