package org.bluecocoon.cs102.sn;

import java.util.NoSuchElementException;

import org.bluecocoon.cs102.sn.util.collections.BinaryTree;
import org.bluecocoon.cs102.sn.util.collections.TreeNode;

public class PostTree {
	private BinaryTree<Post> tree;
	
	public PostTree( Post argPost ) {
		tree = new BinaryTree<Post>( argPost );
	}

	public void postOnPost( int argPostNum, Post argNewPost ) {
		TreeNode<Post> parent = tree.findNode( new Post(argPostNum) );
		if (parent == null) {
			throw new NoSuchElementException("No such post exist : " + argPostNum );
		}
		
		TreeNode<Post> left = parent.getLeft();
		if (left == null) {
			parent.setLeft( new TreeNode<Post>(argNewPost) );
		}else {
			TreeNode<Post> pre;
			TreeNode<Post> right;
			for(pre = left, right = left.getRight(); right != null; pre = right, right = right.getRight() ) {
			}
			pre.setRight(new TreeNode<Post>(argNewPost));
		}
	}

	private void preOrder( TreeNode<Post> argTreeNode ) {
		if (argTreeNode != null) {
			System.out.println( argTreeNode.getItem() );
			System.out.println( "\n    "  );
			preOrder( argTreeNode.getLeft() );
			preOrder(argTreeNode.getRight());
		}
	}

	public void print() {
		preOrder(tree.getRootNode());
	}
}
