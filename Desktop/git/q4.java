import java.util.Scanner;

class q4 {

	public static void main (String[] args){

	Scanner sc = new Scanner(System.in);

	
	System.out.println("Enter First Number ");
	int a = sc.nextInt();
	
	System.out.println("Enter Second Number ");
	int b = sc.nextInt();

	int sum = a+b;
	int difference = a-b;
	int product = a*b;

if (b==0){

	System.out.println(" Invalid divsion: " );
}else{
	
	int quotient = a/b;
System.out.println(" Quetient:" +quotient );
}
int minimum;
int maximum;

if (a>b){

	maximum = a;
	minimum = b;
}else{
	minimum = b;
	maximum = a;
}


System.out.println(" \n Result ");
System.out.println(" Sum = " + sum);
System.out.println("Diiference = " + difference);
System.out.println(" Product = " + product);


System.out.println(" Minimum = " + minimum);
System.out.println(" Maximum = " + maximum);


}
}