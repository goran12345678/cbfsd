package com.zumbapro.model;

import java.io.Serializable;

/*
 CREATE TABLE Batch(
 	id int primary key auto_increment,
 	name varchar(256),
 	startDate varchar(256),
 	startTime varchar(256),
 	duration varchar(256),
 	maxCapacity int
 	
  )
 
 */

/*
 * Class represents a group of student exercising at a specific time.
 */
public class Batch implements Serializable{
	
	String Id;
	String name;
	String startDate;
	String startTime;
	String duration;
	Integer maxCapacity;
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Integer getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	@Override
	public String toString() {
		return "id: " + Id + " name: " + name;
	}
}
