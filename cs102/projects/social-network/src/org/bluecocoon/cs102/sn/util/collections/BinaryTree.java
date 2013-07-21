package org.bluecocoon.cs102.sn.util.collections;

public class BinaryTree<E> extends BinaryTreeBasis<E> {

	public BinaryTree() {
		super();
	}

	public BinaryTree(E argRootItem) {
		super(argRootItem);
	}

	public BinaryTree ( E rootItem, BinaryTree<E> leftTree, BinaryTree<E> rightTree ) throws TreeException {
		this(rootItem);
		attachLeftSubtree(leftTree);
		attachRightSubtree(rightTree);
	}
	
	public void setRootItem( E argItem ) {
		if (root != null) {
			root.setItem(argItem);
		}
		else {
			root = new TreeNode<E>(argItem);
		}
	}
	
	public TreeNode<E> getRootNode(){
		return root;
	}
	
	public void attachLeft(E newItem) {
		if ( !isEmpty() && root.getLeft() == null) {
			root.setLeft(new TreeNode<E>(newItem));
		}
	}
	
	public void attachRight(E newItem) {
		if ( !isEmpty() && root.getRight() == null) {
			root.setRight(new TreeNode<E>(newItem));
		}
	}
	
	public void attachLeftSubtree( BinaryTree<E> argLeftTree ) throws TreeException {
		if(isEmpty()) {
			throw new TreeException("Empty Tree");
		}
		else if (root.getLeft() != null) {
			throw new TreeException( "Left Tree already exist. Cannot overwrite." );
		}
		else {
			root.setLeft(argLeftTree.root);
			argLeftTree.makeEmpty();
		}
	}

	public void attachRightSubtree( BinaryTree<E> argRightTree ) throws TreeException {
		if(isEmpty()) {
			throw new TreeException("Empty Tree");
		}
		else if (root.getRight() != null) {
			throw new TreeException( "Right Tree already exist. Cannot overwrite." );
		}
		else {
			root.setRight(argRightTree.root);
			argRightTree.makeEmpty();
		}
	}

	protected BinaryTree( TreeNode<E> argRootNode ) {
		root = argRootNode;
	}

//	public BinaryTree<E> detachLeftSubtree( BinaryTree<E> argLeftTree ) throws TreeException {
//		if(isEmpty()) {
//			throw new TreeException("Empty Tree");
//		}
//		else {
//			BinaryTree<E> leftTree = new BinaryTree<E>(root.getLeft());
//			root.setLeft(null);
//			return leftTree;
//		}
//	}
//
//	public BinaryTree<E> detachRightSubtree( BinaryTree<E> argRightTree ) throws TreeException {
//		if(isEmpty()) {
//			throw new TreeException("Empty Tree");
//		}
//		else {
//			BinaryTree<E> rightTree = new BinaryTree<E>(root.getRight());
//			root.setRight(null);
//			return rightTree;
//		}
//	}
	
	public TreeNode<E> findNode( E argItem ) {
		return findNode( argItem, root);
	}
	
	private TreeNode<E> findNode( E argItem, TreeNode<E> argTreeNode ) {
		if ( argTreeNode != null && argItem.equals(argTreeNode.getItem()) ) {
			return argTreeNode;
		}

		TreeNode<E> node = findNode( argItem, argTreeNode.getLeft() );
		if (node != null) {
			return node;
		}
		return findNode( argItem, argTreeNode.getRight() );
	}
	
}
