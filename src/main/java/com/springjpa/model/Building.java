package com.springjpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "building")
public class Building implements Serializable{

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@Column(name = "building_ID")
	@NotNull
	@Digits(fraction = 0, integer = 15)
	private long id;

	@Column(name = "NAME")
	@NotNull
	private String name;

	@Column(name = "floor")
	@NotNull
	@Digits(fraction = 0, integer = 2)
	private int floor;
	public Building() {}
	public Building(long id, String name, int floor) {
		
		this.id = id;
		this.name = name;
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "Building [id=" + id + ", name=" + name + ", floor=" + floor + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	
}
