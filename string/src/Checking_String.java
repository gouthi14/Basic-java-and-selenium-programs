
public class Checking_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Red is favorite color.";  
        String startStr = "Red";   
        boolean starts1 = str1.startsWith(startStr);  
        
   
        System.out.println( str1 + " starts with " +  
             startStr + "? " + starts1);
        
        String str2="goutham";
        boolean starts2= str1.startsWith(str2);
        
        System.out.println( str1 + " starts with " +  
                str2 + "? " + starts2);
       
	}

}
