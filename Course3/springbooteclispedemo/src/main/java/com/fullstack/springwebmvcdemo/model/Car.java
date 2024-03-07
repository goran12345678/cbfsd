package com.fullstack.springwebmvcdemo.model;

public class Car {
 String msg;

public Car() {
	// TODO Auto-generated constructor stub
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

@Override
public String toString() {
	return "Car [msg=" + msg + "]";
}
}
