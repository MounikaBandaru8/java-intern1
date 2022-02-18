//Java program to calculate Permutation and Combination of 2 numbers.
import java.util.Scanner;
public class prog5permutationandcombination
{
    public static int fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        int p = (fact(n) / fact(n - r));
        int c = (fact(n) 
                      / (fact(n - r) * fact(r)));
        System.out.println("Permutation = " + p);
        System.out.println("Combination = " + c);
    }
}

