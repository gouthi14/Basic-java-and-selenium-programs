//A static method is a method whose single copy in memory is shared by all the obj of the class.
//static polymo
class four
{
//method to cal square val
static void calculate(double x)
{
System.out.println("square value="+(x*x));
} }
class five
{
//method to calculate square root val
static void calculate(double x)
{
System.out.println("square root"+Math.sqrt(x));
}
}
class staticpolyexample 
{
public static void main(String args[])
{
//super class reference refers to sub class obj
four on=new four();
//call calculate emethod using super class rference
on.calculate(25);
on.calculate(5);
        
        
three b = new three();
b.calculate(25);
b.calculate(5);
//four f=new four();
//f.cal
}

   
}
