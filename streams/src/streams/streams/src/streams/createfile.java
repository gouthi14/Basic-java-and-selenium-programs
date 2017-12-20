//create a text file using FileOutStream
import java.io.*;
class createfile
{
public static void main(String args[])
throws Exception
{
//attach the keyboard to datainputstream
DataInputStream dis=new DataInputStream(System.in);
//attch myfile to FileOutStream
FileOutputStream fout=new FileOutputStream("sirisha.doc",true);
System.out.println("enter text (@ at the end");
char ch;
//read charecters from dis into ch,then write them into fout
//repeat this as long as the rea character is not @
while((ch=(char)dis.read())!='@')
fout.write(ch);
//close the file
fout.close();
}
}
