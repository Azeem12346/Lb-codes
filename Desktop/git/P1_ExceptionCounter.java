import java.io.*;

public class P1_ExceptionCounter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("TestFile.java"))) {

            String line;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                int index = 0;

                while (index != -1) {
                    index = line.indexOf("Exception", index);

                    if (index != -1) {
                        count++;
                        index = index + "Exception".length();
                    }
                }
            }

            System.out.println("Total exceptions: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}