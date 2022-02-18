//Java program to calculate a Factorial of a number.

import java.util.Scanner;
public class prog3fact{

    public static void main(String[] args) 
    {
        
        long factorial = 1;
       System.out.println("enter num ");
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
        
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

