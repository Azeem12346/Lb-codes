import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,9};
        int sum=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]%2==0)
            {
                 sum = sum +  arr[i];
            }
        }
        System.out.println("sum of even numbers " +sum);



    }
    
}
