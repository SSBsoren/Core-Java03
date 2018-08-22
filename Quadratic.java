package Core_Java03;

import java.util.Scanner;
public class Quadratic {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THREE NUMBERS ");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("a = "+a+"  b = "+b+"  c= "+c);
        double root1,root2;
        double determinant=b*b-4*a*c;
        if(determinant>0) {
            root1=(-b+Math.sqrt(determinant))/2.0*a;
            root2=(b-Math.sqrt(determinant))/2.0*a;
            System.out.println("root1 ="+root2);
            System.out.println("root2 ="+root1);
        } else if (determinant==0)
        {
            System.out.println(" Roots are real and equal ");
            root1=(-b+Math.sqrt(determinant))/2.0*a;
            System.out.println("root2 ="+root1);

        }else
        {
            System.out.println(" Roots are imginary ");
        }
    }
}