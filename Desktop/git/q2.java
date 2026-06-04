import java.util.Scanner;
public class q2{
public static void main(String []args)
{
System.out.print("enter two numbers");
Scanner sc=new Scanner(System.in);
double num1=sc.nextDouble();
double num2=sc.nextDouble();
double sum = num1+num2;
System.out.print("sum" +sum);
double difference = num1-num2;
System.out.print("difference" + difference);
double prod = num1*num2;
System.out.print("product" + prod);

if (num2!=0)
{
double quotient=num1/num2;
System.out.print("quotient" + quotient);
}
else
{
System.out.print("quotient is not defined");
}

double minimum = Math.min(num1 ,num2);
System.out.print("minimum " + minimum);
double maximum = Math.max(num1 ,num2);
System.out.print("maximum " + maximum);
}}








