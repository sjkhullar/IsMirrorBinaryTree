package org.learn.Client;

import org.learn.PrepareTree.Node;
import org.learn.PrepareTree.Tree;
import org.learn.Question.IsMirrorTree;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {		
		int[] data1 = {50, 150, 25, 80, 125, 160};
		int[] data2 = {150, 50, 160, 125,80,25};
		
    	Tree tree1 = new Tree();
    	Node root1 = tree1.createNode(100);
    	for(int i : data1 ) {
    		tree1.insert(root1, i );
    	}  
    	Node root2 = tree1.createNode(100);
    	for(int i : data2 ) {
    		tree1.insert(root2, i );
    	}  
    	
    	System.out.println("Binary Tree 1");
    	tree1.printTree(root1);
    	System.out.println("Binary Tree 2");
    	tree1.printTree(root2);
    	System.out.printf("Is Mirror Binary Tree :%b",IsMirrorTree.isMirrorTree(root1,root2));  	
    }
}
