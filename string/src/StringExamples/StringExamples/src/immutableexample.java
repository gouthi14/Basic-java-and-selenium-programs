package StringExamples.StringExamples.src;

public class immutableexample
{
    public static void main(String args[])
    {

String s = "Lets test";

System.out.println(s);

s.concat("this program");
//System.out.println(s);
s=s.concat("carefully");
System.out.println(s);


}}