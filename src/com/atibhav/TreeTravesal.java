package com.atibhav;

public class TreeTravesal {

	public static void main(String[] args) {

		Node n8 = new Node(null, null, 6);
		Node n9 = new Node(null, null, 9);
		Node n6 = new Node(null, null, 4);
		Node n7 = new Node(n8, n9, 8);
		
		
		Node n1 = new Node(null, null, 1);
		Node n2 = new Node(null, null, 3);
		
		Node n3 = new Node(n1, n2, 2);
		Node n4 = new Node(n6, n7, 5);
		
		Node n5 = new Node(n3, n4, 4);
		
		
		
		Tree tree = new Tree(n5);
		inorder(tree.root);
		
	}

	private static void inorder(Node root) {
		// if there is no tree, do nothing
		if(root == null)
			return;
		inorder(root.getLeft());
		System.out.println("root"+root.getValue());
		inorder(root.getRight());
	}
}
