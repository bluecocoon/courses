package org.bluecocoon.cs102.sn;

import java.util.Date;
import java.util.List;

/**
 * It's a tree of posts. People can post on a post.
 * @author vthevar
 */
public class Post {

    @Override
    public String toString() {
        return "Comment [commentTree=" + subPosts + ", commentBody=" + body + ", hashCode()=" + hashCode()
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((body == null) ? 0 : body.hashCode());
        result = prime * result + ((subPosts == null) ? 0 : subPosts.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Post other = (Post) obj;
        if (body == null) {
            if (other.body != null)
                return false;
        } else if (!body.equals(other.body))
            return false;
        if (subPosts == null) {
            if (other.subPosts != null)
                return false;
        } else if (!subPosts.equals(other.subPosts))
            return false;
        return true;
    }

    public Post() {

    }

    public List<Post> getSubPosts() {
        return subPosts;
    }

    public void setSubPosts(List<Post> subPosts) {
        this.subPosts = subPosts;
    }
    
    public boolean append( Post argSubPost ) {
    	return subPosts.add(argSubPost);
    }
    
    public boolean remove( Post argSubPost ) {
    	return subPosts.remove(argSubPost);
    }
    
    public String getBody() {
        return body;
    }

    public void setBody(String argBody) {
        this.body = argBody;
    }

    private List<Post> subPosts;
    private String body;
    private Date lastUpdated;
}
