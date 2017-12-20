package Assignment;

public class SquareRoot2 {

	public static void main(String[] args) {
		
		System.out.println("SqareRoot of 240 is  "+sqr(240));
		System.out.println("SqareRoot of 24 is  "+sqr(24));
 
		System.out.println("SqareRoot of 25 is  "+sqr(25));
	}
	
	public static double sqr(double a){
	
		if(a<0) return -1;
		
		if(a==0 || a==1) return a;
		
		double precision=0.00001;
		double start=0;
		double end=a;
		
		if(a<1)
			end=1;
		
		while(end-start>precision){
			double mid=(start+end)/2;
					
			double midSqr=mid*mid;
			if(midSqr==a) return mid;
			
			else if(midSqr<a) start=mid;
			else end=mid;
			
		}
		
		return (start+end)/2;
		
		
	}

}
