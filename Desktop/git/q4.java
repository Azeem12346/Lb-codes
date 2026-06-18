import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 4 digit number");
        int n=sc.nextInt();
        int a1,a2,a3,a4;
        a4 = n  %10;
        n=n % 10;

        a3 = n  %10;
        n=n /10;

        a2 = n  %10;
        n=n / 10;

        a1 = n  %10;
        n =n / 10;
        
 System.out.println(a1);
  System.out.println(a2);
  System.out.println(a3);
  System.out.println(a4);
    }
}
