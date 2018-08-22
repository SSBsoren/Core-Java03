package Core_Java03;

import java.util.Scanner;

public class Selection_Sort
{
    public static void main(String args[])
    {
        System.out.println("PROGRAM FOR SELECTION SORT");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size=sc.nextInt();
        int x[]=new int[size];
        System.out.print("Enter the array elements :");
        for (int i=0;i<size;i++)
        {
            x[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++) {
            int small = i;
            for (int j = i + 1; j < size; j++) {
                if (x[j] < x[small])
                    small = j;

            }
            //swap between x[i] and x[small]
            if (small != i) {
                x[i] = x[i] + x[small];
                x[small] = x[i] - x[small];
                x[i] = x[i] - x[small];
            }
        }
        System.out.println("So the modified array is : ");
            for (int i = 0; i < size; i++)
            {
                System.out.print(x[i]+ "\t");

            }
            System.out.println();

    }
}
//Selection Sort
//The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
//   from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
//
//1) The subarray which is already sorted.
//2) Remaining subarray which is unsorted.
//
//In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
