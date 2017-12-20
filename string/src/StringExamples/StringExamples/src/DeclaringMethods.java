
package StringExamples.StringExamples.src;

public class DeclaringMethods 
{
int age=10;
String name="xyz";

String address="India";

//decalaring the methods

public void displayInfo()
{
    System.out.println(age);
    System.out.println("the name="+name);
    System.out.println("the address="+address);
    
}
public static void main(String agrs[])
{
    
    //creating an object
    DeclaringMethods dm=new DeclaringMethods();
    dm.displayInfo();
}



}
