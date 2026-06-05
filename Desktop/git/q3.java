import java.util.Scanner;

class q3{

	public static void main (String [] args){

	Scanner sc = new Scanner(System.in);


	System.out.println("Enter Fahrenheit temperature");

	double f = sc.nextDouble();

	double c = (f-32)/1.8;


System.out.println("\n---------------");
System.out.println("Fahrenheit\tCelcius");
System.out.println("-----------------");
System.out.println(f+"\t\t"+c);
System.out.println("-----------------");


}
}