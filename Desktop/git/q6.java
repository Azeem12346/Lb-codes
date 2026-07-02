class Book {
    String title;
    boolean borrowed = false;

    Book(String t) {
        title = t;
    }
}

public class q6 {
    public static void main(String[] args) {

        
        Book b1 = new Book("Java");
        Book b2 = new Book("C++");

       
        Book b3 = new Book("Python");

        System.out.println("Catalog:");
        System.out.println(b1.title + " - Available");
        System.out.println(b2.title + " - Available");
        System.out.println(b3.title + " - Available");

        
        b1.borrowed = true;
        System.out.println("\nBook borrowed: " + b1.title);

        
        System.out.println("\nCatalog Status:");
        System.out.println(b1.title + " - " + (b1.borrowed ? "Borrowed" : "Available"));
        System.out.println(b2.title + " - Available");
        System.out.println(b3.title + " - Available");

        
        b1.borrowed = false;
        System.out.println("\nBook returned: " + b1.title);

       
        System.out.println("\nFinal Catalog Status:");
        System.out.println(b1.title + " - Available");
        System.out.println(b2.title + " - Available");
        System.out.println(b3.title + " - Available");
    }
}