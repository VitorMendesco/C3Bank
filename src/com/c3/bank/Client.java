package com.c3.bank;

import java.io.Serializable;

/**
 * Client is a class that abstracts relevant informations about clients
 * @author Vitor
 * @version 1.0
 */
public class Client implements Serializable {

	/** serializable id */
	private static final long serialVersionUID = 1L;
	/** client name */
	private String name;
	/** client age */
	private byte age;
	
	/** all constructors */
	public Client() {		
	}	
	public Client(String name) {
		this.name = name;
	}
	public Client(String name, byte age) {
		this(name);
		this.age = age;
	}
	
	/** getName() from class Client
	 * @return the name of the client */
	public String getName() {
		return this.name;
	}
	/** setName() from class Client
	 * @param name - the name to replace the actual client name */
	public void setName(String name) {
		this.name = name;
	}
	
	/** getAge() from class Client
	 * @return the age of the client */
	public byte getAge() {
		return this.age;
	}
	/** setAge() from class Client
	 * @param age - the age to replace the actual client age */
	public void setAge(byte age) {
		this.age = age;
	}
	
}
