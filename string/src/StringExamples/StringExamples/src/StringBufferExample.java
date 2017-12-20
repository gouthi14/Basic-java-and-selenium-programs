import java.io.*;
class StringBufferExample
{
public static void main(String args[])
        
throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter sur name");



String sur;
sur=br.readLine();


System.out.println("the value entered for sur name is"+sur);


System.out.println("enter mid name");

String mid=br.readLine();

System.out.println("the value of mid:"+mid);
System.out.println("last name:");
String last=br.readLine();

System.out.println("the value of last"+last);

//now create string buffer object:
StringBuffer sb=new StringBuffer("hello");

System.out.println(sb);
System.out.println("the hash code of Sb objet"+sb.hashCode());
//append sur,last to sb
System.out.println(sb.append(sur));
System.out.println("the hash code of Sb objet"+sb.hashCode());

//System.out.println(sb.append(last));
//System.out.println("the hash code of Sb objet"+sb.hashCode());

//insert mid after sur
//int n=sur.length();

//sb.insert(n,mid);
//display full name
//System.out.println("full name= "+sb);
//reverse thw name and display
//System.out.println("Inverse= "+sb.reverse());
//System.out.println("the length of sb is : "+sb.length());
}
}
