public class StringExample {


public static void main(String[] args) 
{
    

    String s1="this is java";

    String s2=new String("I like It");
    
char ch[]={'s','r','a','v','y','a'};
String str=new String(ch);

//dislay the string

System.out.println("the information avaialable in s1="+s1);
System.out.println(" the info available in s2="+s2);
System.out.println("the info avaialable in str="+str);
//fing the no of the charecters in s2 and s2
System.out.println("length of s1= "+s1.length());
System.out.println("the length of s2 is: "+s2.length());

System.out.println("the length of str is: "+str.length());

//join s1 and s2

System.out.println("s1 joined with s2  by using concat method ="+s1.concat(s2));
System.out.println("s2 joined with str  by using concat method ="+s2.concat(str));
System.out.println(s1+s2+str);

//join 2 strings



//join 3 strings

System.out.println(s1+" hay "+str);

//test if s1 starts with 'this'
boolean x=s1.startsWith("heloo");
if(x==true)
System.out.println("s1 stats with hello");
else
System.out.println("s1 not stats with hello");

//tessts if s2 end with "you"

boolean x2 = s2.endsWith("It");
if(x2 == true)
  
System.out.println("s2 ends with It");
else
System.out.println("s2 not ends with It");


//convert the case of s1



System.out.println("Uppser case s1="+s1.toUpperCase());
System.out.println("lower s1="+s2.toLowerCase());

}

}
