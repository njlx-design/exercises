package Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner=new Scanner(System.in);

        Arrayss arr = new Arrayss();

        int []number={1,2,3,4,5};
        //System.out.println("Enter" +number.length+" numbers");
        //for (int i=0; i<number.length; i++)
        //  number[i]=scanner.nextInt();
        //arr.delet(number,2);

        //arr.update(number , 3 ,9);
        //arr.shiftleft_Delete(number,2);
        int result= arr.LinearSearch(number , 9);
        if (result!=-1)
            System.out.println("Value found at index :"+result);
        else System.out.println("Value not found");
        //arr.Traversal(number);
    }
}
