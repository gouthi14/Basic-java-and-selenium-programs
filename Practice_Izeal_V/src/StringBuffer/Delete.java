package StringBuffer;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("goutham");
		StringBuffer sb1=new StringBuffer("goud");
		
		sb.delete(1, 3);
		
		sb.append("thuluva");
		
		sb1.deleteCharAt(3);
		
		System.out.println(sb);
		System.out.println(sb1);
		
	}

}
