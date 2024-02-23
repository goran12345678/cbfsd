package com.capstone.queue.monitor;

import java.util.Queue;

import com.capstone.model.Cab;
import com.capstone.queue.AvailableQueue;
import com.capstone.queue.TransitQueue;

public class Dashboard {
	AvailableQueue aQueue;
	TransitQueue tQueue;
	public Dashboard() {
		// TODO Auto-generated constructor stub
	}
	public Dashboard(AvailableQueue aQueue, TransitQueue tQueue) {
		this.aQueue = aQueue;
		this.tQueue = tQueue;
	}
	public Queue<Cab> getAvailableCabs(){
		return this.aQueue.getCopy();
	}
	public Queue<Cab> getInTransitCabs(){
		return this.tQueue.getCopy();
	}


}
