package org.bluecocoon.cs102.sn.util.collections;

public class TreeNode<E> {
	private E item;
	private TreeNode<E> leftChild;
	private TreeNode<E> rightChild;
	
	public TreeNode(E item) {
		super();
		this.item = item;
	}

	public TreeNode(E item, TreeNode<E> leftChild, TreeNode<E> rightChild) {
		super();
		this.item = item;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}

	public TreeNode<E> getLeft() {
		return leftChild;
	}

	public void setLeft(TreeNode<E> leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode<E> getRight() {
		return rightChild;
	}

	public void setRight(TreeNode<E> rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
