package org.learn.Client;

import org.learn.Question.IsMirrorTree;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		// Binary Tree 1:
		// root level 0
		Node A = Node.createNode(70);
		// Level 1
		Node B = Node.createNode(50);
		Node C = Node.createNode(55);
		// Level 2
		Node D = Node.createNode(25);
		Node E = Node.createNode(80);
		Node F = Node.createNode(37);
		Node G = Node.createNode(45);

		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;

		//Binary Tree 2:
		
		// root level 0
		Node P = Node.createNode(70);
		// Level 1
		Node Q = Node.createNode(55);
		Node R = Node.createNode(50);
		// Level 2
		Node S = Node.createNode(45);
		Node T = Node.createNode(37);
		Node U = Node.createNode(80);
		Node V = Node.createNode(25);

		// connect Level 0 and 1
		P.left = Q;
		P.right = R;
		// connect level 1 and level 2
		Q.left = S;
		Q.right = T;
		R.left = U;
		R.right = V;

		System.out.println("Binary Tree 1 :");
		IsMirrorTree.printTree(A);
		System.out.println("Binary Tree 2 :");
		IsMirrorTree.printTree(P);
		
		boolean isMirrorBinaryTrees = IsMirrorTree.isMirrorTree(A, P);
		System.out.printf("Check Trees are mirror binary tree : %b", isMirrorBinaryTrees);
	}
}
