import java.util.Scanner;
public class CrossStarPattern {
    // Creating the cross-star pattern
    public static void main(String[] args) {
        // Create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern (odd number): ");
        int size = sc.nextInt();
        sc.close();
        // If the size is even, print an error message
        if (size % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }
        // Create a loop
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




