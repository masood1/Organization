package com.springjpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "desk")
public class Desk implements Serializable{

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@Column(name = "desk_id")
	private long id;

	@Column(name = "username")
	private String userName;

	@Column(name = "emp_num")
	private String emp_num;
	
	@Column(name = "floor")
	private int floor;
	
	@Column(name = "building_id")
	private long building_ID;

	public Desk() {}

	public Desk(long id, String userName, String emp_num, int floor, long building_ID) {
		
		this.id = id;
		this.userName = userName;
		this.emp_num = emp_num;
		this.floor = floor;
		this.building_ID = building_ID;
	}

	@Override
	public String toString() {
		return "Desk [id=" + id + ", userName=" + userName + ", emp_num=" + emp_num + ", floor=" + floor
				+ ", building_ID=" + building_ID + "]";
	}
	
	
}
