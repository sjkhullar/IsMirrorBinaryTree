
package org.learn.Question;

import org.learn.PrepareTree.Node;

public class IsMirrorTree {
	public static boolean isMirrorTree(Node tree, Node mirrorTree) {
		if( null == tree && null == mirrorTree) 
			return true;
		
		if( null == tree || null == mirrorTree) 
			return false;
		
		if(tree.data != mirrorTree.data)
			return false;
		
		if(false == isMirrorTree(tree.left,mirrorTree.right))
			return false;
		
		if(false ==  isMirrorTree(tree.right,mirrorTree.left))
			return false;
		
		return true;
	}
}
