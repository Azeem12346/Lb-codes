import java.util.Scanner;

	class q5{

public static void main (String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number");
	double n = sc.nextDouble();



	System.out.println("\n-------Math Class Operations-----");
	System.out.println("Absolute value: " +Math.abs(n));
	System.out.println("Square root: " +Math.sqrt(n));
	System.out.println("Power (n²): " +Math.pow(n,2));
	System.out.println("Sin(" + n + "):" +Math.sin(Math.toRadians(n)));
	System.out.println("Cos(" + n +"):" +Math.cos(Math.toRadians(n)));
	

	}

}