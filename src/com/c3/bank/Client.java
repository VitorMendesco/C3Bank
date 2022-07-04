package com.c3.bank;

import java.io.Serializable;

/**
 * Client is a class that abstracts relevant informations about clients
 * @author Vitor
 * @version 1.1
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
	
	/** get the name from class Client
	 * @return the name of the client */
	public String getName() {
		return this.name;
	}
	/** set the name from class Client
	 * @param name - String to replace the actual client name value */
	public void setName(String name) {
		this.name = name;
	}
	
	/** get the age from class Client
	 * @return the age of the client */
	public byte getAge() {
		return this.age;
	}
	/** set the age from class Client
	 * @param age - byte to replace the actual client age value */
	public void setAge(byte age) {
		this.age = age;
	}
	
}
