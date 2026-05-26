
import java.io.*;

public class P3_FinancialApplication {

    public static void logToFile(String message) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("P3_Errors.txt", true));
            writer.write("Logged: " + message);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("Logging failed: " + e);
        }
    }

    static void testCases(int choice) {
        try {
            if (choice == 1) {
                int r = 10 / 0;
            }
            if (choice == 2) {
                int[] a = new int[5];
                System.out.println(a[10]);
            }
            if (choice == 3) {
                String s = null;
                System.out.println(s.length());
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
            logToFile(e.getClass().getSimpleName() + " occured!");
        }
    }

    public static void main(String[] args) {
        testCases(1);
        testCases(2);
        testCases(3);
    }
}
