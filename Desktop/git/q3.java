import java.util.ArrayList;

class Catalog {

    ArrayList<String> books = new ArrayList<>();

    void addBook(String name) {
        books.add(name);
    }

    void displayBooks() {
        for (String b : books) {
            System.out.println(b);
        }
    }

    void removeBook(String name) {
        System.out.println("Removing  book");
        books.remove(name);
    }
}

public class q3 {
    public static void main(String[] args) {

        Catalog c = new Catalog();

        c.addBook("Java");
        c.addBook("Python");
        c.addBook("C++");

        c.displayBooks();

        c.removeBook("Python");

        System.out.println("After removing:");
        c.displayBooks();
    }
}