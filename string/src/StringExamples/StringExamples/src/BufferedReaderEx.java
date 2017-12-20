package StringExamples.StringExamples.src;

import java.io.*;
class BufferedReaderEx
{
public static void main(String args[])
throws Exception
{
    
//to accept data from keyboard create bf obj
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a char  :--->  ");
char ch=(char)br.read();
System.out.println("u entered   --->  "+ch);








BufferedReader mark=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter number for checking PASS or FAIL");
int number=(int)mark.read();
}
}
