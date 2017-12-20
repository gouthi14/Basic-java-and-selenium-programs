 class overridingex2
 {
int a;
int b;
static void add(int a, int b)
{  
    int c = a+b;
   System.out.println("Sum="+c);
}
 }
 class overridingex3
{
int a;
int b;

 static void add(int a, int b)
{  
    int c = a+b;
   System.out.println("Sum="+c);
}}

public class staticoverriding{
public static void main(String args[])
{
    overridingex2 o1 = new overridingex2();
    overridingex3 o3 = new overridingex3();
    o1.add(4,8);
    o3.add(2,7);
   
}}

     