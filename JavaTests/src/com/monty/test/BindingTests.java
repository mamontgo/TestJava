package com.monty.test;


public class BindingTests {

	public boolean equals(BindingTests other) {
		System.out.println("Inside of Test.equals");
		return false;
	}

	public static void main(String[] args) {
		Object t1 = new BindingTests();
		Object t2 = new BindingTests();
		BindingTests t3 = new BindingTests();
		Object o1 = new Object();

		int count = 0;
		System.out.println(count++);// prints 0
		t1.equals(t2);
		System.out.println(count++);// prints 1
		t1.equals(t3);
		System.out.println(count++);// prints 2
		t3.equals(o1);
		System.out.println(count++);// prints 3
		t3.equals(t3);
		System.out.println(count++);// prints 4
		t3.equals(t2);
	}
}
