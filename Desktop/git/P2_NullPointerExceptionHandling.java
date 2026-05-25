
public class P2_NullPointerExceptionHandling {
    public static void main(String[] args) {
        // versionA();
        versionB();
        // versionC();
    }

    public static void versionA() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getName());
        }
    }

    public static void versionB() {
        String str = null;

        if (str != null)
            System.out.println(str.length());

    }

    public static void versionC() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }
}
