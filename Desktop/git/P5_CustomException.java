import java.io.*;

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class P5_CustomException {

    public static void logToFile(String message) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("P5_Errors.txt", true));
            writer.write("Log: [ERROR] " + message);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("Logging failed: " + e);
        }
    }

    public static void processData(String input) throws InvalidDataException {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("No data provided.");
        }

        String[] tokens = input.trim().split("\\s+");
        for (String token : tokens) {
            try {
                Integer.parseInt(token);
            } catch (NumberFormatException e) {
                throw new InvalidDataException("\"" + token + "\" is not a valid number.");
            }
        }

        System.out.println("No exception");
    }

    public static void main(String[] args) {
        String[] testCases = { "10 20 30", "10 abc 30", "" };

        for (String input : testCases) {
            try {
                processData(input);
            } catch (InvalidDataException e) {
                System.out.println("Exception: InvalidDataException - " + e.getMessage());
                logToFile("InvalidDataException occurred.");
            } catch (IllegalArgumentException e) {
                System.out.println("Exception: IllegalArgumentException - " + e.getMessage());
                logToFile("IllegalArgumentException occurred.");
            }
        }
    }
}
