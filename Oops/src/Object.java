
public class Object {
	int length;
	int width;
	void insert(int i,int w){
		length=i;
		width=w;
	}
void calculateArea(){
	System.out.println(length*width);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object r1=new Object();
		Object r2=new Object();
		r1.insert(20, 40);
		r2.insert(40,60);
		
		r1.calculateArea();
		r2.calculateArea();
	}

}
