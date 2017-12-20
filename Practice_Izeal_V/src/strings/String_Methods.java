package strings;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String name=new String("goutham");
		
		String test=new String("goutham is java developer");
		//charAt method
		char ch=name.charAt(3);
		System.out.println(ch);
		
		
		//int length
		int length=name.length();
		System.out.println(length);
		
		//subString
		System.out.println(name.substring(2, 5));
		System.out.println(name.substring(4));
		
		//boolean Contains
		
		System.out.println(name.contains("java"));
		System.out.println(test.contains("java"));
		System.out.println(test.contains("hello"));
		
		//Join()

		String s4=String.join("-","goutham","is","java","developer");
		System.out.println(s4);
		
	//boolean equals
		
		String s5=new String("gouthi");
		String s6=new String("gouthi");
		String s7=new String("Gouthi");
		
		System.out.println(s5.equals(s7));
		
		System.out.println(s5.equals(s6));
		
		//isEmpty
		String s8=new String();
		
		System.out.println(s5.isEmpty());
		System.out.println(s8.isEmpty());
		
		//String concat
		
		
		String s9=s5.concat(s7);
		System.out.println("After concat     "+s9);
		
		//String replace
		
	String s10=s7.replace("o", "t");
		
	System.out.println("After replae     "+s10);
	
	//String replace(CharSequence old, CharSequence new)
	
	String s11=s4.replace("is", "was");
	
	System.out.println("After replae     "+s11);
	
	String s12=s6.replaceAll("gou", "GOU");
	
	System.out.println("After replae     "+s12);
	
String s13=s6.replaceFirst("G", "r");
	
	System.out.println("After replae     "+s13);
	
	//static String equalsIgnoreCase(String another)
	
	System.out.println(s6.equalsIgnoreCase(s7));

	//Java String split() method example
	
	String s14=new String("goutham is JAVA developer at izeal");
	String[] words=s14.split("\\s");
	System.out.println("after split");
	for(String w:words){
		
		System.out.println(w);
	}
	
	
	//String toUpperCase(Locale l)
	
	String s14upper=s14.toUpperCase();
	
	System.out.println(s14upper);
	
	
	//String toLowerCase()
		
	String s14lower=s14.toLowerCase();
	
	System.out.println(s14lower);
	
	
	//Java String intern() method example
	String s15=new String("izeal");
	String s16="izeal";
	String s17=s15.intern();
	
	System.out.println(s15==s16);
	System.out.println(s16==s17);
	//
	
	//	int indexOf(int ch)
	
	}

}
