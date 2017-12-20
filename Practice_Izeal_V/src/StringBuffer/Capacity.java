package StringBuffer;

public class Capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer();
		System.out.println(" before append the capacity of StringBuffer is : "+sb.capacity());
		
		sb.append("  thuluva");
		
		System.out.println(" the capacity of StringBuffer is : "+sb.capacity());
	}

}
