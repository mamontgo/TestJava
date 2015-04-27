package com.monty.othertest;

import java.util.ArrayList;
import java.util.List;


public class NestedStaticExample extends Thread {
	public static void main(String args[]) {
		System.out.println(new String("abc") == "abc");
		System.out.println("abc" == "abc");
	}
public void start(){
	System.out.println("jhere");
}

}
