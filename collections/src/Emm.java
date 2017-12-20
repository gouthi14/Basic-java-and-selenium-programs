
public class Emm {

	
	
	    public static void main(String[] args)
	    {
	        StringBuffer a = new StringBuffer("xyz");
	        StringBuffer b = new StringBuffer("abc");
	        a.delete(1,3);
	        a.append(b);
	        System.out.println(a);
	    }
	}
