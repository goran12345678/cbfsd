package com.capstone.model;


public class Cab {
	int id;
	double lat;
	double lng;
	String driver;
	String number;
	String destination;
	int minutesETA;
	public Cab() {
		// TODO Auto-generated constructor stub
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getMinutesETA() {
		return minutesETA;
	}
	public void setMinutesETA(int minutesETA) {
		this.minutesETA = minutesETA;
	}
	@Override
	public String toString() {
		return "Cab [id=" + id + ", lat=" + lat + ", lng=" + lng + ", driver=" + driver + ", number=" + number + "]";
	}
	

}
