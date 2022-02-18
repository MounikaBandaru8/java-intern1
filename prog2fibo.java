// Java program to calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class prog2fibo 
{
  public static void main(String[] args) 
 {
    int  firstTerm = 0, secondTerm = 1;
    System.out.println("enter n value");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
