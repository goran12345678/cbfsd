package com.capstone.queue;

import java.util.LinkedList;
import java.util.Queue;

import com.capstone.model.Cab;

import jakarta.servlet.ServletContextListener;

/*
 * Concern: hold an array of cabs delivering customers.
 * First in are the cabs with least amount of time left until they drop off customer.
 */
public class TransitQueue implements ServletContextListener{
	//FIFO
	Queue<Cab> queue;

	public TransitQueue() {
		// TODO Auto-generated constructor stub
		queue = new LinkedList<Cab>();
		System.out.println("[TransitQueue] constructor called");
	}
	public Cab getNext() {
		Cab car = queue.peek();
		//test some conditions
		System.out.println("[TransitQueue] returned next cab");
		return queue.remove();
	}
	//method called by another concern responsible for sorting cabs according to delivery time.
	public void update(Queue<Cab> newQueue) {
		//TOD: GIS query for remainder of travel time
		queue.clear();
		queue.addAll(newQueue);
		System.out.println("[TransitQueue] added cab");
	}
	public Queue<Cab> getCopy(){
		Queue<Cab> queue = new LinkedList<Cab>();
		queue.addAll(this.queue);
		return queue;
	}

}
