class Person1
{
//instance variables
private String name="manogna";
private int age=20;
//default cons
Person1()
{
}
//parameterised con
Person1(String n,int i)
{
name=n;
age=i;
} 

Person1(int i,String n)
{
  age=i;
name=n;
}
//method
void xy()
{
System.out.println("hello this is  "+name);
System.out.println("age is  "+age);
}


public static void main(String args[])
{
//crate raju ob here default con is called
Person1 obj=new Person1();
obj.xy();

Person1 obj1=new Person1("Utkarsh",6);
obj1.xy();

Person1 obj2=new Person1(3,"rey");
obj2.xy();
//Person1 e=new Person1(22, "vankat");
//e.talk();
}
}
