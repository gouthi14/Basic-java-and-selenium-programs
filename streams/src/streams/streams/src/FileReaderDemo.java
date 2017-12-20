package streams.streams.src;

//File reader is useful to read data form a file in the form of characters from a file name called â€œtextâ€�
//EXAMPLE://read the data from a file using FILEREADER
import java.io.*;
class FileReaderDemo
{
public static void main(String args[]) throws IOException
{
//variables
int ch;
FileReader fr ; 

System.out.println( "File Contaimd Data Like");
//check if the file exits or not:
//FileReader fr;
//check if file exists or nottry
try
{
fr=new FileReader("ggg.doc");
}
catch(Exception ex)
{
System.out.println("no file");
}

return;

//read from FileReader till the end of file 
while((ch=fr.read())!=-1)
{

System.out.print((char)ch);
//close the file
}

	


fr.close();
}
}


