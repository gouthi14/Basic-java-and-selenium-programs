package Assignment;

public class PassingParameter_ArrayForMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]={3,4,5,6,7};
		
		change(array);
		
		for(int r:array)
			System.out.println(r);
	}
	
	public static void change(int b[]){
		
		for(int i=0;i<b.length;i++){
			b[i]+=5;
		}
	}

}
