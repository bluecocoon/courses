package org.bluecocoon.cs102.sn.util.collections;

public class CircularQueueReferenceBased<V> extends QueueReferenceBased<V> {

	public CircularQueueReferenceBased(int argMaxSize) {
		super(argMaxSize);
	}

	@Override
	public void enqueue(V argItem) throws QueueException {
		if( isFull() ) {
			lastNode = lastNode.getNext();
			lastNode.setItem(argItem);
			return;
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
	
	public static void main(String[] args) throws QueueException {
		CircularQueueReferenceBased<Integer> q = new CircularQueueReferenceBased<Integer>(4);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println( "Element 1 : " + q.dequeue() );
		System.out.println( "Element 2 : " + q.dequeue() );
		System.out.println( "Element 3 : " + q.dequeue() );
		System.out.println( "Element 4 : " + q.dequeue() );
	}
}
