package org.bluecocoon.cs102.sn;

import org.bluecocoon.cs102.sn.util.collections.CircularQueueReferenceBased;

/*
 * It's a Circular queue impl. Not using priority queue to reduce complexity. Thus not able to bring the latest commented post on top.
 * */
public class Wall extends CircularQueueReferenceBased<Post> {

	private static final int MAX_POSTS = 10;

	public Wall() {
		super(MAX_POSTS);
	}
    
}
