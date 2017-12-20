//reading the text file suing FileInputStream
import java.io.*;
class ReadDataUsingFileInputStreamApp46
{
public static void main(String args[])
        throws Exception{
//attach the file to FileInputStream
FileInputStream fin=new FileInputStream("D:\\DurableTopicReceive .java");
System.out.println("file contains:");
//read the characters from FileInputStream and write them
//to monitor 
int ch;
while((ch=fin.read())!=-1)
System.out.print((char)(ch));
//close the file
fin.close();
}
}