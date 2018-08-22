package Core_Java03;

import java.util.Scanner;

public class Linear_Search
{
    public static void main(String args[])
    {
        System.out.println("PROGRAM FOR LINEAR SEARCH");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int size=sc.nextInt();
        int x[]=new int[size];

        System.out.print("Enter the array Elements :");
        for (int i=0;i<size;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("Enter the Element to search for : ");
        int ele=sc.nextInt();
        int count=0;
        for (int i=0;i<size;i++)
        {
            if (x[i]==ele)
            {
                count++;
                break;
            }
        }
        if (count != 0)
            System.out.print("Element found ");
        else
            System.out.print("Element not found ");

    }
}
//Linear search or sequential search is a method for finding a particular value in a list, that consists of checking every one of its elements,
//one at a time and in sequence, until the desired one is found. Linear search is the simplest search algorithm.
//Linear searches don't require the collection to be sorted.
