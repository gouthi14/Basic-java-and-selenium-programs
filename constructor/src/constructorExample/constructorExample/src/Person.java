class Person
{
//instance variables 
 //String name="komal";
// int age=20;
//default con
//Person()
//{
    
//}
//Paremetirised constructor
Person(String name,int age)
{
name=name;
age=age;


}
Person(int personAge,String Personname)
{
int age=personAge;
String name=Personname;
}
//method
public void talk()
{
System.out.println("hello my name is   "+name);
System.out.println(" my age is  "+Age);
}


public static void main(String args[])
{
    //Person p=new Person();
    //p.talk();

Person p1=new Person(1,"ss");
//p1.talk();
//Person p1=new Person();
//p1.talk();
}
}

