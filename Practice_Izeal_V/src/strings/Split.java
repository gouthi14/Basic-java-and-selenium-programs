package strings;

import java.util.StringTokenizer;

public class Split {

	public static void main(String[] args) {
	
		
		
		String str="Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";
	
	String words[]=str.split(" ");
	
	for(int i=0;i<words.length;i++){
		System.out.println(words[i]);
	}
	
	}
	}