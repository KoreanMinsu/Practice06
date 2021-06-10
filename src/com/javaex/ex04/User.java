package com.javaex.ex04;

public class User {
	
	protected String id;
	protected String password;
	protected String name;
	
	public User() {}
	
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	private String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	private String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
	}
	
	
	
}
