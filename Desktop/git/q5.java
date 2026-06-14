import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter row ");
        int row=sc.nextInt();
        
        int num=1;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
            num++;
        }
    System.out.println();
    }

    }
    
}
