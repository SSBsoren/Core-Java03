//program to calculate the largest number among the array list
package Core_Java03;

import java.util.Scanner;

public class larges_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size,max=-1;
        System.out.print("Enter the size of array : ");
        size=sc.nextInt();
        int arr[]=new int[size];

        System.out.print("Enter the array Element : ");
        for (int i=0;i<size;i++)//loop for Entering the element
            arr[i]=sc.nextInt();
        for (int i=0;i<size;i++)//loop for the finding largest elements
            if (arr[i]>max)
                max=arr[i];


            System.out.println("The largest Number is  : " +max);
    }
}
