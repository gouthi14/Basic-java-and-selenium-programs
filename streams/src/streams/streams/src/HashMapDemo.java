import java.util.*;

class HashMapDemo
{
    public static void main(String args[])
    {
        
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        
        hm.put(1111,"Manasa");
        hm.put(2222,"friut");
        
        
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}