package com.fullstack.application.model;

import java.sql.Date;

/*
 * Class represents a point in time committed to by the instructor. This class is reponsible for setting that point in time.
 */
public class Schedule {

	int id;
	Batch batch;
	Date startDate;
	int duration; // minutes

	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Schedule(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getTime() {
		String result = "";

		return result;
	}

	@Override
	public String toString() {
		return "Schedule [batch=" + batch + ", startDate=" + startDate + ", duration=" + duration + "]";
	}

}
