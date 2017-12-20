//dynamic overridden
class one 
{
//method to calculate square val
void calculate(double x)
{
System.out.println("square value"+(x*x));
}
}
class two  
        {
//method to cal square root val
void calculate(double x)
{
System.out.println("square root"+Math.sqrt(x));
} 
}

class overridingexample 
{
public static void main(String args[])
{
    

//create an obj for class
//call calculate ()
one o=new one();
o.calculate(4);

two t=new two();
t.calculate(16);

}
}
