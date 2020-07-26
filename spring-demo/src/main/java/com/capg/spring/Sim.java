package com.capg.spring;

public interface Sim {
	
	public void call();
	
	public void browse();
	
	default void printAllContacts() {
		System.out.println("This is by default");
	}
	
}
