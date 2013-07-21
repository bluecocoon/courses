package org.bluecocoon.cs102.sn.util.collections;

public class Node<V> {
	private V item;
	private Node<V> next;
	
	public Node( V argItem ) {
		item = argItem;
	}

	public V getItem() {
		return item;
	}
	
	public void setItem(V item) {
		this.item = item;
	}
	
	public Node<V> getNext() {
		return next;
	}
	
	public void setNext(Node<V> next) {
		this.next = next;
	}
	
}
