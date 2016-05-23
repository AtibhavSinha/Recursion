package com.atibhav;

public class TreeTravesal {

	public static void main(String[] args) {

		
		Node n1 = new Node(null, null, 5);
		Node n2 = new Node(null, null, 10);
		
		Node n3 = new Node(null, null, 6);
		Node n4 = new Node(null, null, 2);
		
		
		Node n5 = new Node(n1, n2, 2);
		Node n6 = new Node(n3, n4, 3);
		
		Node n7 = new Node(n5, n6, 10);
		
		Tree tree = new Tree(n7);
		inorder(tree);
		
	}

	private static void inorder(Tree tree) {
		
	}
}
