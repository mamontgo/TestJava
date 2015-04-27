package com.monty.test.ob;

import java.util.Observable;

public class MyObservable extends Observable {
	
	Integer counter= new Integer(0);
	
	void increment() {
		counter++;
		super.setChanged();
		super.notifyObservers(counter);
		
	}
	
	public static final void main(String args[]){
		
		MyObservable o = new MyObservable();
		
		o.addObserver(new MyObserver(1));
		o.addObserver(new MyObserver(2));
		
		o.increment();
		o.increment();
		
		
		
	}
}
