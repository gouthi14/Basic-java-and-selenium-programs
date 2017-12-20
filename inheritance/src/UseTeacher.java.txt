/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
public class UseTeacher extends InheritenceTeacherApp18
{

    public static void main(String args[])
    {
        int fees=1234;
        int marks=89;
        
    UseTeacher obj=new UseTeacher();
    
    obj.setId(123);
    obj.setName("Gautham");
    obj.setSal(12345);
    obj.setAddress("USA");
    
    System.out.println("the value of id :"+obj.getId());
    
    System.out.println(obj.getName());
    System.out.println(obj.getSal());
    
    
    }
}
