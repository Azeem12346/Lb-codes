import java.util.Scanner;


class oddEven
{
    int odd=0;
    int even=0;
   public void getData(int [] arr)
   {

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]%2==0)
        {
            even++;
        }
        else
        {
            odd++;
        }
       
    }
     System.out.println("Total odd numbers "+ odd);
        System.out.println("Total even numbers "+ even);

   } 


public static void main(String[] args)
{
   oddEven s1=new oddEven();
    int numbers[]={1,2,4,5,6,7,8,9};
    s1.getData(numbers);
}}
