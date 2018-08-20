package Core_Java03;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {

        Scanner reader =new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBERS : ");
        double a=reader.nextDouble();
        System.out.print("ENTER SECOND NUMBERS : ");
        double b =reader.nextDouble();

        System.out.println("ENTER AN OPERATOR ( +  -   *  / )");
        char operator =reader.next().charAt(0);
        double result;

        switch(operator)
        {
            case '+' :
                result =a+b;
                break;

            case '-' :
                result =a-b;
                break;
            case '/' :
                result =a/b;
                break;
            case '*':
                result =a*b;
                break;
            default:
                System.out.println("err");
                return;
        }
        System.out.println("Result="+result);

    }

}

