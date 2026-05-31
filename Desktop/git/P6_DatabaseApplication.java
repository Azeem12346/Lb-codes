import java.io.*;
import java.sql.*;

class DatabaseConnectionException extends Exception {
    public DatabaseConnectionException(String message) {
        super(message);
    }
}

class DatabaseConnection implements AutoCloseable {
    private Connection conn;

    public DatabaseConnection(String url, String username, String password) throws DatabaseConnectionException {
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful");
        } catch (SQLException e) {
            throw new DatabaseConnectionException("Could not connect to the database.");
        }
    }

    public void executeOperation() throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeQuery("SELECT * FROM nonexistent_table");
    }

    @Override
    public void close() {
        try {
            if (conn != null)
                conn.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            System.out.println("Failed to close connection: " + e);
        }
    }
}

public class P6_DatabaseApplication {

    public static void logToFile(String message) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("P6_Errors.txt", true));
            writer.write("Log: [ERROR] " + message);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("Logging failed: " + e);
        }
    }

    public static void main(String[] args) {
        String url = "";
        String username = "";
        String password = "";

        // Test 1: Valid connection
        System.out.println("-- Test 1 --");
        try (DatabaseConnection db = new DatabaseConnection(url, username, password)) {
        } catch (DatabaseConnectionException e) {
            System.out.println("Exception: DatabaseConnectionException - " + e.getMessage());
            logToFile("DatabaseConnectionException occurred.");
        }

        // Test 2: Invalid connection
        System.out.println("-- Test 2 --");
        try (DatabaseConnection db = new DatabaseConnection("jdbc:oracle:thin:@invalid:1521/invalid", "invalid",
                "invalid")) {
        } catch (DatabaseConnectionException e) {
            System.out.println("Exception: DatabaseConnectionException - " + e.getMessage());
            logToFile("DatabaseConnectionException occurred.");
        }

        // Test 3: Valid connection, operation fails
        System.out.println("-- Test 3 --");
        try (DatabaseConnection db = new DatabaseConnection(url, username, password)) {
            db.executeOperation();
        } catch (DatabaseConnectionException e) {
            System.out.println("Exception: DatabaseConnectionException - " + e.getMessage());
            logToFile("DatabaseConnectionException occurred.");
        } catch (SQLException e) {
            System.out.println("Exception: SQLException - An error occurred during the database operation.");
            logToFile("SQLException occurred.");
        }
    }
}
