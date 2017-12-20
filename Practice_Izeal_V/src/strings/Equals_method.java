package strings;

public class Equals_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s=new String("goutham");
		String s1="goutham";
		String s3="goutham";
		String s2="RAJEEV";
		boolean s4=s1.equals(s3);
		boolean s5=s1.equals(s);
		
		System.out.println(s4);
		System.out.println(s5);
		
		
		
		//String compare by == operator
		
		boolean s6=s1==s;
		boolean s7=s1==s3;
		
		System.out.println(s6);
		System.out.println(s7);
		
		
		//String compare by compareTo() method
		
		System.out.println(s1.compareTo(s));
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
	}

}
