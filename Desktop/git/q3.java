import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0.0;
        for(int i=1;i<=n;i++)
        {
             sum= sum+(1.0/i);
        }
        System.out.println("sum of reciprocals " + sum);
    }
    
}
