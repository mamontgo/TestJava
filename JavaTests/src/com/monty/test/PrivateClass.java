package com.monty.test;
import com.monty.othertest.NestedStaticExample;
import com.monty.othertest.NestedStaticExample.NonstaticNested;
import com.monty.othertest.NestedStaticExample.StaticNested;


public class PrivateClass {
	
	
	public final static void main(String args[]){
		
		short x = 32300;
		System.out.println(x);
		for(int i =0; i< 1000; i++){
			x+=1;
			System.out.println(x);
		}
		float f = .5432f;
		
		class Local {
			public void name() {System.out.println("Inner Local");}
		}
		
		Local l = new Local();
		l.name();
		
		PrivateClass p = new PrivateClass();
		p.sayHi();

		
	}
	
	public void sayHi() {
		
		class Local {
			public void name() {System.out.println("Inner Local");}
		}
		
		Local l = new Local();
		l.name();
		
		InnerClass inner = new InnerClass(1);
		inner.sayHi();
		
		InnerClass inner2 = new InnerClass(2);
		inner2.sayHi();		
		

	}
	
	
	private class InnerClass {
		private int value;
		
		public InnerClass(int value){
			this.value = value;
		}
		
		public void sayHi() {
			System.out.println("Hi: " + value);
		}
	}
}
