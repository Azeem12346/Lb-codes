import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,3,4};
        
        System.out.println("All Possible Combinations are...");

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                for(int k=0; k<3; k++) {
                    if(i != j && j != k && k != i) {
                        System.out.println(" " + arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }
    }
}
