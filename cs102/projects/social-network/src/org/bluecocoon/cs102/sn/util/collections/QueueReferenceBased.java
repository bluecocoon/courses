package org.bluecocoon.cs102.sn.util.collections;

public class QueueReferenceBased<V> implements IQueue<V>{
	protected Node<V> lastNode;
	protected final int MAX_SIZE;
	protected int size;
	
	public QueueReferenceBased( int argMaxSize ) {
		MAX_SIZE = argMaxSize;
	}
	
	@Override
	public boolean isEmpty() {
		return lastNode == null;
	}

	@Override
	public void enqueue(V argItem ) throws QueueException {
		if( isFull() ) {
			throw new QueueException( "Queue is full" );
		}

		Node<V> newNode = new Node<V>( argItem );
		
		if ( isEmpty() ) {
			newNode.setNext(newNode);
		} else {
			newNode.setNext( lastNode.getNext() );
			lastNode.setNext( newNode );
		}
		lastNode = newNode;
		size++;
	}

	@Override
	public V dequeue() throws QueueException {
		if ( isEmpty() ) {
			throw new QueueException( "Queue is Empty" );
		}
		
		Node<V> firstNode = lastNode.getNext();
		if ( firstNode == lastNode ) {
			//lastElement
			lastNode = null;
		} else {
			lastNode.setNext(firstNode.getNext());
		}
		size--;
		return firstNode.getItem();
	}

	@Override
	public void dequeueAll() {
		lastNode = null;
		size = 0;
	}

	@Override
	public V peek() throws QueueException {
		if (isEmpty()) {
			throw new QueueException( "Queue is empty" );
		}
		return lastNode.getNext().getItem();
	}

	@Override
	public boolean isFull() {
		return size == MAX_SIZE;
	}

}
