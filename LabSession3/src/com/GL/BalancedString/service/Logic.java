package com.GL.BalancedString.service;
import java.util.Stack;

public class Logic {
	public static Boolean validateBalanceString(String str) {
		
	Stack<Character> stack=new Stack<Character>();
	
	for(int i=0; i<str.length(); i++) {
		char bracket=str.charAt(i);
		if(bracket=='(' || bracket=='{' || bracket=='[') {
			
			stack.push(bracket);
			continue;
		}
		 else if(bracket==')')
         {
            if(stack.isEmpty() || stack.pop() != '(')
            {
               return false;
            }
         }
         else if(bracket=='}')
         {
            if(stack.isEmpty() || stack.pop() != '{')
            {
               return false;
            }
         }
         else if(bracket==']')
         {
            if(stack.isEmpty() || stack.pop() != '[')
            {
              return false;
            }
         }
      }
    return stack.isEmpty();
        
	 
		
}}
	


	

