package com.capstone.model;

import java.util.Date;

/*
 * Data structure used to represent customer pickup request
 */
public class PickupRequest {
	int id;
	double lat;
	double lng;
	String address;
	String customerName;
	int numPassengers;
	Date localUtc;
	Date createdOn;
	public PickupRequest() {
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getNumPassengers() {
		return numPassengers;
	}
	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}
	public Date getLocalUtc() {
		return localUtc;
	}
	public void setLocalUtc(Date localUtc) {
		this.localUtc = localUtc;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "PickupRequest [id=" + id + ", lat=" + lat + ", lng=" + lng + ", address=" + address + ", customerName="
				+ customerName + ", numPassengers=" + numPassengers + ", localUtc=" + localUtc + ", createdOn="
				+ createdOn + "]";
	}
	

}
