package Core_Java03;

import java.util.Scanner;
class largest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a,b,c, max;
        System.out.print("ENTER TNE NUMBER :");
        a=sc.nextInt();

        System.out.print("ENTER TNE NUMBER :");
        b=sc.nextInt();

        System.out.print("ENTER TNE NUMBER :");
        c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
                max=a;
            else
                max=c;

        }else{

            if(b>c)
                max=b;
            else
                max=c;
        }
        System.out.println("Largest no is  ="+max);
    }

}
