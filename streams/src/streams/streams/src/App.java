package streams.streams.src;

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App{
/****** START SET/GET METHOD, DO NOT MODIFY *****/
        protected String out_var_1 = "";
        public String getout_var_1() {
                return out_var_1;
        }
        public void setout_var_1(String val) {
                out_var_1 = val;
                //System.out.println(val);
        }
/****** END SET/GET METHOD, DO NOT MODIFY *****/
        public void invoke() 
                throws Exception {
/* Available Variables: DO NOT MODIFY
        Out : String out_var_1
* Available Variables: DO NOT MODIFY *****/

        App mnc = new App();

                mnc.readFile();

    }
public static void main(String[] args) {

              App mnc = new App();
              mnc.readFile();

       }
       public void readFile(){
              BufferedReader br = null;
              StringBuilder sb = new StringBuilder(512);
              try {
                     String sCurrentLine;
                     br = new BufferedReader(new FileReader("Goutham.Java Developer.iZealInc.docx"));

                     while ((sCurrentLine = br.readLine()) != null) {
                         
                         
                           sb.append(sCurrentLine+"\n");
                           
                     }
                setout_var_1(sCurrentLine);
                out_var_1="HelloWorld";
              } catch (IOException e) {
                     e.printStackTrace();
              } finally {
                     try {
                           if (br != null)
                                  br.close();
                     } catch (IOException ex) {
                           ex.printStackTrace();
                     }
              }
       }
}