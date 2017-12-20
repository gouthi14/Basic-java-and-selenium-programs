//Dynamic Poly
class overloadingexample
{
//method to add values
    void add(int i)
    {
        System.out.println("the mul of i is "+(i*i));
    }
    
    void add(double j)
    {
        System.out.println("the add of j is "+(j+j));
    }
    
    void add(int i,double j)
    {
        System.out.println("the sum of i and j :"+(i+j));
    }
    
    
    public static void main(String args[])
    {
        overloadingexample obj=new overloadingexample();
        obj.add(1,2);
        obj.add(2.0);
        obj.add(1);
        
    }
}