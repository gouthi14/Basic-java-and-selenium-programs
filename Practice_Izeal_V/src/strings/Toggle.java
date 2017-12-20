package strings;

public class Toggle {
	
	public static String toggles(String str){
		
		String words[]=str.split("\\s");
		String toggle="";
		for(String w:words){
			String first=w.substring(0,1);
			String afterFirst=w.substring(1);
			toggle=first.toLowerCase()+afterFirst.toUpperCase()+"";
		}
			return toggle.trim();
		
		
	}

	public static void main(String[] args) {
		
		
	System.out.println(Toggle.toggles("goutham"));

	}

}
