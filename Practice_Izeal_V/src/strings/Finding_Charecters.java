package strings;

import java.text.DecimalFormat;

public class Finding_Charecters {

	static void charper(String str){
		int totalchar=str.length();
		
		int upercase=0;
		int lowercase=0;
		int digits=0;
		int others=0;
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)){
			upercase++;
			
		}
		
			else if(Character.isLowerCase(ch)){
			lowercase++;
		}
			else if(Character.isDigit(ch)){
				digits++;
			}
			
			else{
				others++;
			}
		}
		
	
	
	double upercaselatterpersentage=(upercase*100)/totalchar;
	double lowercaselatterpersentage=(lowercase*100)/totalchar;
	double digitspersentage=(digits*100)/totalchar;
	double otherspersentage=(others*100)/totalchar;
	
	DecimalFormat format=new DecimalFormat("##.##");
	
	System.out.println("in"+str+":");
	
	System.out.println("upercase latters"+format.format(upercaselatterpersentage)+"%");
	System.out.println("lowercase latters"+format.format(lowercaselatterpersentage)+"%");
	System.out.println("Digits"+format.format(digitspersentage)+"%");
	System.out.println("others"+format.format(otherspersentage)+"%");
	
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
charper("Goutham Is Java Developer From 12 Years,he is 100% Good");
		
	}

}
