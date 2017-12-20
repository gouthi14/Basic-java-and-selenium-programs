package strings;

public class Swaping_String_withoutthirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="goutham";
		String b="thuluva";
		
		System.out.println("before swaping   "+a+  "   and  "+b);
		
		a=a+b;
		
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("After swaping   "+a+"  and   "+b);
	}

}
