//FileWriter is useful to create a file by wring charecters into it.
//writing a program to create file using //FILEWRITER
//creat a text file using FW
import java.io.*;
class FileWriterDemo
{
public static void main(String args[])
throws IOException
{
//take a string
String str="this is a book on java"+"n iam a student";
         
//attach the file to FILEWRITER
FileWriter fw=new FileWriter("pavan.xls");
//read character wise fro mstr and write it to FW
for(int i=0;i<str.length();i++)
fw.write(str.charAt(i));
//close the file
fw.close();
}
}
