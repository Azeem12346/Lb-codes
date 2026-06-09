
import java.util.scanner;
public class q1
{
public static void main(String[] args) {
    int even=0;
    int odd=0;
    

    int arr[]={1,3,4,5,6,7,8,6,5,9};
    int i;
    for( i=0;i<=arr.length-1;i++)
    {
        if (arr[i]%2==0) {
            even++;
            
        }
        else{
            odd++;
        }
    }
    System.out.println("Total even numbers is " +even);
    System.out.println("total odd numbers is " +odd);

}}


