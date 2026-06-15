import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sequences: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        int i=0;
        do{
            System.out.print(+ a +" ");
            int c= a+b;
            a=b;
            b=c;
            i++;
        } while(i<n);

        }
    }
