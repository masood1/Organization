package com.springjpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "floor")
public class Floor implements Serializable{

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@Column(name = "floor_id")
	private long id;

	public Floor() {}
	
	@Column(name = "total_desk")
	private int total_Desk;

	@Column(name = "floornumber")
	private int floorNumber;

	@Column(name = "buildingid")
	private long buildingId;

	@Override
	public String toString() {
		return "Floor [id=" + id + ", total_Desk=" + total_Desk + ", floorNumber=" + floorNumber + ", buildingId="
				+ buildingId + "]";
	}

	public Floor(long id, int total_Desk, int floorNumber, long buildingId) {
	
		this.id = id;
		this.total_Desk = total_Desk;
		this.floorNumber = floorNumber;
		this.buildingId = buildingId;
	}


}
