package com.impl.queu;

public interface QueueInterface {

	public boolean isEmpty();
	public int size();
	public Object frontElement();
	public void enqueue(Object element);
	public Object dequeue();
	
}
