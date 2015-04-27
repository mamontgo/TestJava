package com.monty.test.ob;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

	private final Integer id;
	
	public MyObserver(Integer id) {
		super();
		this.id = id;
	}
	
	
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println(id + " observed " + arg1);
	}

}
