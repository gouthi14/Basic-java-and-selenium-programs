//Write a program to compress the data in a file using DeflaterOutputStream:
//compressing a file
import java.io.*;
import java.util.zip.*;
class ZipDemo
{
public static void main(String args[])
throws Exception
{
//attch the original file :file1 to read data
FileInputStream fis=new FileInputStream("whoru.mp3");
//aatched the compressed file:file2 to FileOutStream
FileOutputStream fos=new FileOutputStream("compress.txt");
//attach FileOutStream to DfalterOutputStream
DeflaterOutputStream dos=new DeflaterOutputStream(fos);
//read data from FileInputStream and write it into DeflaterOutputStream
int ch;
while((ch=fis.read())!=-1)
dos.write(ch);
//close the file
fis.close();
dos.close();
}

}
