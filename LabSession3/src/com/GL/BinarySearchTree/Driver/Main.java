package com.GL.BinarySearchTree.Driver;
import java.util.Scanner;
import com.GL.BinarySearchTree.Service.FindSumPair;
import com.GL.BinarySearchTree.Service.Node;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		Node root =null;
		FindSumPair findSP = new FindSumPair();
		 root=findSP.insert(root,40);
		 root=findSP.insert(root,20);
		 root=findSP.insert(root,60);
		 root=findSP.insert(root,10);
		 root=findSP.insert(root,30);
		 root=findSP.insert(root,50);
		 root=findSP.insert(root,70);
		 
				 
		 System.out.println("Enter the sum to find pair.");
		 int sum = sc.nextInt();
		 findSP.findPairwithGivenSum(root,sum);
		 
		 
		
	}

}
