package StringExamples.StringExamples.src;

class EqualityOfString
{
        public static void main(String args[])
{
    String s1 = "Hello" ;
    //    String s2=new String("sir
    String s2="Hello";
//String s2="sirisha";
    String s=new String("Hello");
System.out.println("the hash code of s1:"+s1.hashCode());
System.out.println("the hash code of s:"+s2.hashCode());
//System.out.println("the has code of  str1:"+str1.hashCode()) ; 
//str1 = "New String" ; 
//System.out.println("new hash code for str1:"+str1.hashCode()) ;
//String str2 = "sirisha" ;
System.out.println("s : "+s.hashCode()) ; 
    //String name="merline";
//System.out.println("the hash code of name:"+name.hashCode());
   //String s1="hai12";
//s1=s1+str1;
if(s1==s)
//if(s1.equals(s))
System.out.println("both are same");
else 
System.out.println("not same");
        
}
}
