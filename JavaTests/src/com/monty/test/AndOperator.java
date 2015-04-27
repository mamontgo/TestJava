package com.monty.test;

import java.io.BufferedReader;
import java.io.FileReader;

public class AndOperator {
	int y;
	boolean isfalse;
	int[] data = new int[10];
	String notinit;
	
	public AndOperator(){
		
	}
	
	public AndOperator(int one){
		System.out.println("here");
	
	}
	
	public static void main(String[] args) {

		
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.gc();

		int x = 1;
		int z1 = 1;
		int $1 = 1;
		int _1 = 1;

		System.out.println(++x * 2);

		System.out.println(((int) (x++ * 2)));

		AndOperator a = new AndOperator();
		System.out.println(a.y);
		System.out.println(a.isfalse);
		System.out.println(a.data[5]);
		AndOperator ao = new AndOperator();
		ao.runThread();
		System.exit(1);
	}

	public void runThread() {
		Thread temp = new Thread() {

			@Override
			protected void finalize() throws Throwable {
				// TODO Auto-generated method stub
				super.finalize();
				System.out.println("finalise this...");
			}

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("running..");
			}
		};

		temp.run();
	}
}
