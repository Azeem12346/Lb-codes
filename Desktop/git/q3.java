import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);  
        int[] arr = new int[4];
        System.out.println("enter elements");
        for(int i=0;i<4;i++)
            {
                arr[i]=sc.nextInt();
            } 
        
        int sum =0;
        int product = 1;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}
