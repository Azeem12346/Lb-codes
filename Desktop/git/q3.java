import java.util.Scanner;

class q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        
        String[] words = text.trim().split("\\s+");
        System.out.println("Total Words: " + words.length);

        
        String[] sentences = text.split("[.!?]");
        System.out.println("Total Sentences: " + sentences.length);

        
        System.out.print("Enter letter to count: ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for(int i = 0; i < text.length(); i++) {
            if(Character.toLowerCase(text.charAt(i)) == Character.toLowerCase(ch)) {
                count++;
            }
        }

        System.out.println("Occurrences of '" + ch + "': " + count);
    }
}