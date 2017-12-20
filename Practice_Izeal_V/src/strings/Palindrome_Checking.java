package strings;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome_Checking {

	public static void main(String[] args) {
	
		Scanner se=new Scanner(System.in);
		
		System.out.println("enter your String");
		 
		String input=se.nextLine();
		
		Stack st=new Stack();
		
		for(int i=0;i<input.length();i++){
			
			st.push(input.charAt(i));
			
			
		}
		
		String reverse="";
		while(!st.isEmpty()){
			reverse=reverse+st.pop();
			
		}
		
		if(input.equals(reverse))
			System.out.println("given String is Palindrome");
			
			else
				System.out.println("Given String is not a palindrome");
				
			
		
		
		
		

	}

}
