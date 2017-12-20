package arrays;

public class Array_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] ar={4,5,2,7,1,9,3};
		 int n=7;
		 
		 for(int i=0;i<=n;i++)
		 {
			 for(int j=0;j<n-1;j++){
				 int k=j+1;
				 int a=ar[j];
				 int b=ar[k];
				 
				 if(b<a)
				 {
					 int temp1=a;
					 int temp2=b;
					 ar[j]=b;
					 ar[k]=a;
				 }
				 
			 }
		 }
		 
		 
		 for(int d=0;d<n;d++){
			 System.out.print(ar[d]+" ");
		 }
	}
	
	
	

}
