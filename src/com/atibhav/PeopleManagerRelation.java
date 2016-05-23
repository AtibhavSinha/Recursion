package com.atibhav;

public class PeopleManagerRelation {

	private final String name;
	private final String manager;

	public PeopleManagerRelation(String name, String manager) {
		this.name = name;
		this.manager = manager;
	}

	public String getName() {
		return name;
	}

	public String getManager() {
		return manager;
	}
	
}
