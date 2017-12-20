//uncompressing a file using InfaterInputStream
//import java.util.zip;
import java.io.*;
import java.util.zip.InflaterInputStream;

class UnZipDemo
{
public static void main(String args[])
throws Exception
{
//attach Inputfile file2to FileInputStream for reading data
FileInputStream fis=new FileInputStream("compress.txt");
//attach output file: file3 to FileOutputStream for writing data
FileOutputStream fos=new FileOutputStream("whoru.mp3");
//attach InflaterInptStream to FileInputStream for uncompressing
InflaterInputStream iis=new InflaterInputStream(fis);
//read data from InflaterInputStream and write it into FileOutputStream
int data;
while((data=iis.read())!=-1)
fos.write(data);
//close the files
fos.close();
iis.close();
}
}
