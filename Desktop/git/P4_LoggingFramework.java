
import java.util.logging.Logger;

public class P4_LoggingFramework {

    private static final Logger logger = Logger.getLogger(P4_LoggingFramework.class.getName());

    static void riskyOperation(int choice) {
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
            logger.severe(e.getClass().getSimpleName() + " occurred.");
        }
    }

    public static void main(String[] args) {
        riskyOperation(1);
        riskyOperation(2);
        riskyOperation(3);
    }
}