package com.impl.queu;

import java.util.ArrayList;

public class MyQueue implements QueueInterface {

	private ArrayList<String> theQueue;

	public MyQueue() {
		theQueue = new ArrayList<String>();
	}

	public boolean isEmpty() {
		return theQueue.isEmpty();
	}

	public int size() {
		return theQueue.size();
	}

	public Object frontElement() {
		if (theQueue.size() > 0) {
			return theQueue.get(0);
		} else {
			return null;
		}
	}

	public void enqueue(Object element) {
		theQueue.add((String)element);
	}

	public Object dequeue() {
		return theQueue.remove(0);
	}

}
