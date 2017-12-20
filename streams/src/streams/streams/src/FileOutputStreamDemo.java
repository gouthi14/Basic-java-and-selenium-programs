import java.io.*;
//create a text file using FileOutStream
class FileOutputStreamDemo
{
public static void main(String args[])
throws Exception
{
//attach the keyboard to datainputstream
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//attch myfile to FileOutStream
FileOutputStream fout=new FileOutputStream("pavan.doc",true);
//FileOutputStream fout1 = new FileOutputStream("minal.do

System.out.println("enter text ( $ at the end");

char ch;
//read charecters from dis into ch,then write them into fout
//repeat this as long as the rea character is not @
while((ch=(char)br.read())!='$')
fout.write(ch);
//close the file
fout.close();
}
}


