package com.tutorial.hibernate.mappings.collections_mysql_2.map;

/**
 * Implement 
 * @author Jayram
 *
 */
public class Certificate {
	private int id; 
	private String name; 
	public Certificate() {} 
	public Certificate(String name) { 
		this.name = name; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}