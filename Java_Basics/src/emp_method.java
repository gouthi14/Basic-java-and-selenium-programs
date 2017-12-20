public class emp_method {
String name="goutham";
int age=23;
char gender='m';
float salary=5678.33f;
public void emp()
{
	System.out.println(name);
	System.out.println(age);
	System.out.println(salary);
	System.out.println(gender);
	
}
public static void main(String args[])
{
	emp_method obj=new emp_method();
	obj.emp();
	
	
}
}
