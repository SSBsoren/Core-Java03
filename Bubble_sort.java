//Bubble Sort
package Core_Java03;

import java.util.Scanner;

public class Bubble_sort
{
    public static void main(String args[])
    {
        System.out.println("PROGRAM FOR BUBBLE SORT");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int size=sc.nextInt();
        int x[]=new int[size];

        System.out.println("ENTER THE ARRAY ELEMENTS :");
        for (int i=0;i<size;i++)
        {
            x[i]=sc.nextInt();

        }
        for (int j=0;j<size-1;j++)
        {
            for (int i=0;i<(size-j-1);i++)
            {
                if (x[i]>x[i+1])
                {
                    //Swap both the elements
                    x[i]=x[i]+x[i+1];
                    x[i+1]=x[i]-x[i+1];
                    x[i]=x[i]-x[i+1];
                }
            }
        }
        System.out.print("So the Modified array is : ");
        for (int i=0;i<size;i++)
        {
            System.out.print(x[i]+"\t");
        }
        System.out.println();
    }
}
//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
//Example:
//First Pass:
//( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
//( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
//( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
//( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
//
//Second Pass:
//( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
//( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
//( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
//Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
//
//Third Pass:
//( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
//( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )