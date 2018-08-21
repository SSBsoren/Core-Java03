//program to insert an element in a specific position of a single dimensional array .
package Core_Java03;

import java.util.Scanner;

public class Insert_Element_Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array : ");
        size=sc.nextInt();

        int arr[]=new int[size+1];

        System.out.print("Enter the Array Elements : ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();

        System.out.print("Enter the Element to insert and the position : ");
        int num=sc.nextInt();
        int pos=sc.nextInt();

        for(int i=size-1;i>=pos;i--)
            arr[pos]=num;
        System.out.print("Number inserted  \n The new Number is given by : ");
        for (int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }
}
