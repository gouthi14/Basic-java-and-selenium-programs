package StringBuffer;

public class Performance_Test {
	
	
	
	public static String concatwithString(){
		
		String s="goutham";
		
		for(int i=0;i<=10000;i++){
			
		
		 s=s+"thuluva";
		}
		return s;
			
		
	}
	
	
	public static void StringBuffer concatwithStringBuffer(){
		StringBuffer sb=new StringBuffer("varshik");
		for(int i=0;i<=10000;i++){
			sb.append("goud");
			
		}
	}

	public static void main(String[] args) {
		
		
		

	}

}
