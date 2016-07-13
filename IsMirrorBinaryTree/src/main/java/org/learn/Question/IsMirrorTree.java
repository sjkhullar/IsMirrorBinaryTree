
package org.learn.Question;

import java.util.LinkedList;
import java.util.Queue;

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
	
	public static void printTree(Node root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return ;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			Node node = queue.poll();			
			System.out.printf("%d ",node.data);		
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		System.out.println("");	
		return;
	}
}
