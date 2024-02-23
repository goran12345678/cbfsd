package com.capstone.queue.dispatch;

import com.capstone.model.Cab;
import com.capstone.queue.AvailableQueue;
import com.capstone.queue.TransitQueue;

/*
 * Concern: find cab able to reach customer is least amount of time.
 */
public class CabDispatcher {
	AvailableQueue aQueue;
	TransitQueue tQueue;
	public CabDispatcher() {
		// TODO Auto-generated constructor stub
	}
	public CabDispatcher(AvailableQueue aQueue, TransitQueue tQueue) {
		this.aQueue = aQueue;
		this.tQueue = tQueue;
	}
	public Cab getCab() {
		Cab result = null;
		result = this.aQueue.getNext(); //find who is available and has been waiting the longest.
		if(result == null) {
			result = tQueue.getNext(); //find who will be available soonest
		}
		return result;
	}

}
