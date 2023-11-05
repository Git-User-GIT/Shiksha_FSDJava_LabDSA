package com.GL.BinarySearchTree.Service;
import java.util.HashSet;

public class FindSumPair {
	//static Node root=null;
	
	
	public Node insert(Node root, int value){
		
			if(root ==null) {
				return new Node(value);}
				if(value <root.data)
					root.left=insert(root.left,value);
				else
					root.right=insert(root.right,value);
				
				return root;
	}
	
	
		
	public Boolean findpairUntil(Node root , int sum ,HashSet<Integer> set) {
		if (root == null)
			return false;

		if (findpairUntil(root.left, sum, set))
			return true;

		if (set.contains(sum - root.data)) {
			System.out.println("Pair is found ("
					+ (sum - root.data) + ", "
					+ root.data + ")");
			return true;
		}
		else
			set.add(root.data);

		return findpairUntil(root.right, sum, set);
		
		
	}
	public void findPairwithGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		if (!findpairUntil(root, sum, set))
			System.out.print("Pairs do not exit"
					+ "\n");
	}
}


