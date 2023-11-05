package com.GL.BalancedString.Driver;
import java.util.Scanner;
import com.GL.BalancedString.service.Logic;

public class Main {
	

	public static void main(String[] args) {
		Boolean result;
	//	String exp="([{[]})";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String having Brackets");
		String input=sc.next();
		Logic logic=new Logic();
		
		result=Logic.validateBalanceString(input);
		
		if(result)
			System.out.print("String is balanced");
		else
			System.out.print("String is not balanced");


	}

}
