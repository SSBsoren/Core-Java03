package Core_Java03;


import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int r,c,n,num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n=sc.nextInt();
        System.out.println("floyd Triangle");


        for (r=1;r<=n;r++)
        {
            for(c=1;c<=r;c++)
            {
                System.out.print(num+"  ");
                num++;
            }

            System.out.println("  ");
        }
    }
}