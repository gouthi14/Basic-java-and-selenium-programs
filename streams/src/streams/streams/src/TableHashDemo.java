/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
import java.util.*;
public class TableHashDemo {
    
    public static void main(String args[])
    {
        
        Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
        
                
        ht.put(1,"kkk");
        ht.put(2, "hh");
        
        for(Map.Entry m:ht.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
        
    }
}
