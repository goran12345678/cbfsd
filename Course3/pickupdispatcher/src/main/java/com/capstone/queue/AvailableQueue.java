package com.capstone.queue;

import java.util.LinkedList;
import java.util.Queue;

import com.capstone.model.Cab;

import jakarta.servlet.ServletContextListener;

/*
 * Queue holds available cabs by most recent availability. LIFO queue
 * Concern: efficiently fetch available transporation units.
 */
public class AvailableQueue implements ServletContextListener{
	
	//FIFO
	Queue<Cab> queue;

	public AvailableQueue() {
		// TODO Auto-generated constructor stub
		queue = new LinkedList<Cab>();
		System.out.println("[AvailableQueue] constructor called");
	}
	
	public Cab getNext() {
		Cab car = queue.peek();
		//test some conditions
		System.out.println("[AvailableQueue] returned next cab");
		return queue.remove();
	}
	public void addCab(Cab cab) {
		queue.add(cab);
		System.out.println("[AvailableQueue] added cab");
	}
	public Queue<Cab> getCopy(){
		Queue<Cab> queue = new LinkedList<Cab>();
		queue.addAll(this.queue);
		return queue;
	}

}
