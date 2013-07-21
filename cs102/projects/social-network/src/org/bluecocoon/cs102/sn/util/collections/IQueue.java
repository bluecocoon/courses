package org.bluecocoon.cs102.sn.util.collections;


public interface IQueue<V> {

	boolean isEmpty();
	boolean isFull();
	void enqueue( V argNode ) throws QueueException;
	V dequeue() throws QueueException;
	void dequeueAll();
	V peek() throws QueueException;
}
