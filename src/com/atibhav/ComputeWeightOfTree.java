package com.atibhav;

public class ComputeWeightOfTree {

	public static void main(String[] args) {

		Node n8 = new Node(null, null, 12);
		
		Node n1 = new Node(n8, null, 5);
		Node n2 = new Node(null, null, 10);
		
		Node n3 = new Node(null, null, 6);
		Node n4 = new Node(null, null, 2);
		
		
		Node n5 = new Node(n1, n2, 2);
		Node n6 = new Node(n3, n4, 3);
		
		Node n7 = new Node(n5, n6, 10);
		
		
		Tree tree = new Tree(n7);
		
		System.out.println("Weight of the tree = "+computeWeight(tree.root));
		
	}
	
	//Think : Sum = own value(already counted) + left child + right child
	//Base condition: weight of empty tree is zero.

// Try to vizualize till last depth
//	return 5 + 4 
//			 + 2 + 0 + 0
//			 + 1 + 0 + 0
//			 + 3 + sumNode(null ) + sumNode( null ) ; 
	
	private static int computeWeight(Node node) {
		// Base Condition
		// 3 condition need to think : no child (but what if one child?): Not generic, one child, no tree
		if(node == null){
			return 0;
		}
		else
		 return node.getValue() + computeWeight(node.getLeft()) + computeWeight(node.getRight());
	}

//	private static int computeWeight(Node node) {
//		// Base Condition
//		// What if node has just one child???
//		// Can be fixed with this: but not clean code.
//		if(node == null)
//			return 0;
//		// Can with above code below be removed?
////		if(node.getLeft() == null && node.getRight() == null){
////			return node.getValue();
////		}
//		return node.getValue() + computeWeight(node.getLeft()) + computeWeight(node.getRight());
//	} 
//	
	

}


//private static int computeWeight(Node node) {
//	// Base Condition
//	// What if node has just one child???
//	if(node.getLeft() == null && node.getRight() == null){
//		return node.getValue();
//	}
//	return node.getValue() + computeWeight(node.getLeft()) + computeWeight(node.getRight());
//}
