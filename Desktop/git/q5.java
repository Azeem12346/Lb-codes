
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values for Rectangle1 : ");
        System.out.print("Enter Value of X1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter Value of Y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter Value of W1: ");
        int w1 = sc.nextInt();
        System.out.print("Enter Value of H1: ");
        int h1 = sc.nextInt();
        System.out.println("Enter Values for Rectangle2 : ");
        System.out.print("Enter Value of X2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter Value of Y2: ");
        int y2 = sc.nextInt();
        System.out.print("Enter Value of W2: ");
        int w2 = sc.nextInt();
        System.out.print("Enter Value of H2: ");
        int h2 = sc.nextInt();

        int left = Math.max(x1, x2);
        int top = Math.max(y1, y2);
        int right = Math.min(x1 + w1, x2 + w2);
        int bottom = Math.min(y1 + h1, y2 + h2);

        if(left >= right || top >= bottom) {
            System.out.println("Rectangles do not overlap.");
        } else {
            int interWidth = right - left;
            int interHeight = bottom - top;

            System.out.println("Intersection Rectangle:");
            System.out.println("X = " + left);
            System.out.println("Y = " + top);
            System.out.println("Width = " + interWidth);
            System.out.println("Height = " + interHeight);
        }
    }
}
