import java.util.Scanner;

 public class q4
 {
    
    public static void main(String[] args) 
    {
        
         Scanner sc=new Scanner(System.in);
    System.out.println("Enter amount:");
    float amt=sc.nextFloat();

    if(amt<=500)
    {
        float profit=amt*0.02f;
          
    
    System.out.println("total profit " +profit);
    }

if(amt>500 && amt<=5000)
{
     float profit=amt*0.05f;
    System.out.println("total profit " +profit);

}
if(amt>5000)
{
   float  profit=amt*0.08f;
    System.out.println("total profit " +profit);

}
    }}