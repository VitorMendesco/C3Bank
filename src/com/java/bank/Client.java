package com.java.bank;

public class Client {

	private String name;
	private byte age;
	
	public Client() {		
	}
	
	public Client(String name) {
		this.name = name;
	}
	
	public Client(String name, byte age) {
		this(name);
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public byte getAge() {
		return this.age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
}
