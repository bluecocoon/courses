package org.bluecocoon.cs102.sn.util.collections;

public abstract class BinaryTreeBasis<E> {
	protected TreeNode<E> root;

	public BinaryTreeBasis() {
		super();
	}

	public BinaryTreeBasis( E argRootItem ) {
		super();
		this.root = new TreeNode<E>(argRootItem);
	}
	
	boolean isEmpty(){
		return root == null;
	}
	
	public void makeEmpty() {
		root = null;
	}
	
	public E getRootItem() throws TreeException {
		if (root == null) {
			throw new TreeException( "Empty Tree" );
		}
		
		return root.getItem();
	}
}
