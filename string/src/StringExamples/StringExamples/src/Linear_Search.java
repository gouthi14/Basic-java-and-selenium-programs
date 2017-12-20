import java.util.Scanner;

/**
 * Program to read array values & find the value exist in Array or not Linear
 * search
 *
 * @author Minal
 */
public class Linear_Search {

    int array[];
    int num; // no of elements for array i.e allocating memory for array
    int findno;
    int inputno;

    public void linearsearch() {
        System.out.println("Linear Search");
        System.out.print("Enter the number to Search in Array :: ");
        Scanner input2 = new Scanner(System.in);
        findno=input2.nextInt();
        for(int j=0;j<num;j++){
            if(array[j]== findno)
            {
                System.out.println("Number found");
            }else
            {
                System.out.println("Number not found");
            }
            
                    
        }

    }

    public void readArray() {

        System.out.println("Enter the values for the Array");
        for (int i = 0; i < num; i++) {
            System.out.print("Array " + i + " is : ");
            Scanner input1 = new Scanner(System.in);
            inputno = input1.nextInt();

        }
    }

    public static void main(String[] args) {
        Linear_Search obj1 = new Linear_Search();
        System.out.print("Enter the number of Elements :: ");
        Scanner input = new Scanner(System.in);
        obj1.num = input.nextInt();
        obj1.readArray();
        obj1.linearsearch(); // 59
    }
}