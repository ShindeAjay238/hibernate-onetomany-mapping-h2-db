package com.ajay.hibernate.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Location
{
	@Id
	private Integer id;
	private String name;
	
	@OneToMany
	private List<User> users;
	public Location()
	{

	}

	public Location(Integer id, String name) 
	{
	
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
