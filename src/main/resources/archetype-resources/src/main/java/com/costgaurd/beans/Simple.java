package com.costgaurd.beans;

public class Simple {
	private final String sayHello;
	private final long id;
	
	

	public long getId() {
		return id;
	}

	public Simple(String sayHello, long id) {
		super();
		this.sayHello = sayHello;
		this.id = id;
	}

	public String getSayHello() {
		return sayHello;
	}
}
