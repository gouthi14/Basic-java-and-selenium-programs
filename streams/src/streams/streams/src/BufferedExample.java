package streams.streams.src;

//to improve the efficiency of wrting a data into a file using BufferedOutputStream:
//creating a text file using //BufferdOutputStream:
import java.io.*;
class BufferedExample
{
public static void main(String args[])
throws IOException
{
//attach keyboard to DataInputStream
DataInputStream dis=new DataInputStream(System.in);
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       //attach myfile to FileOutputStream in append mode
FileOutputStream fout=new FileOutputStream("rajvir.xls",true);
//attach FileOutputStream to BufferdOutputStream
BufferedOutputStream bout=new BufferedOutputStream(fout);
System.out.println("enter text(@ at the end):");
char ch;
//read charecters from dis into ch,then write them in to bout.
while((ch=(char)dis.read())!='@')
bout.write(ch);
//close the file
bout.close();
}
}
